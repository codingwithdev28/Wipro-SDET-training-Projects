package Zudio_store;

import java.sql.*;
import java.util.Scanner;

public class BillingService {

	    public static void generateBill(Scanner sc) throws Exception {
	        Connection con = DBConnection.getConnection();

	        int total = 0;

	        PreparedStatement billPS = con.prepareStatement(
	            "INSERT INTO bills (total_amount) VALUES (?)",
	            Statement.RETURN_GENERATED_KEYS
	        );

	        billPS.setInt(1, 0);
	        billPS.executeUpdate();

	        ResultSet rs = billPS.getGeneratedKeys();
	        rs.next();
	        int billId = rs.getInt(1);

	        while (true) {
	            System.out.print("Enter Product ID (101 to stop): ");
	            int pid = sc.nextInt();
	            if (pid == 0) break;

	            System.out.print("Size: ");
	            String size = sc.next();

	            System.out.print("Qty: ");
	            int qty = sc.nextInt();

	            PreparedStatement pricePS = con.prepareStatement(
	                "SELECT price FROM products WHERE product_id=?"
	            );

	            pricePS.setInt(1, pid);
	            ResultSet pr = pricePS.executeQuery();
	            pr.next();

	            int price = pr.getInt("price");
	            total += price * qty;

	            PreparedStatement itemPS = con.prepareStatement(
	                "INSERT INTO bill_items (bill_id, product_id, size, quantity) VALUES (?,?,?,?)"
	            );

	            itemPS.setInt(1, billId);
	            itemPS.setInt(2, pid);
	            itemPS.setString(3, size);
	            itemPS.setInt(4, qty);
	            itemPS.executeUpdate();
	        
	        PreparedStatement stockPS = con.prepareStatement(
		            "UPDATE variants SET quantity= quantity- ? WHERE product_id=? AND size=?"
		        );

		        stockPS.setInt(1, qty);
		        stockPS.setInt(2, pid);
		        stockPS.setString(3, size);
		        stockPS.executeUpdate();
		        
		        System.out.println("Item added to bill");
	        }

	        PreparedStatement updateBill = con.prepareStatement(
	            "UPDATE bills SET total_amount=? WHERE bill_id=?"
	        );

	        updateBill.setInt(1, total);
	        updateBill.setInt(2, billId);
	        updateBill.executeUpdate();
	        
	        
	        System.out.println("Bill Id: " + billId);
	        System.out.println("Total Bill: " + total);
	    }
	}
