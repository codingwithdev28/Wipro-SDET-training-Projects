package Zudio_store;

import java.sql.*;
import java.util.Scanner;
	
public class StockService {

	    public static void addStock() throws Exception {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Product ID: ");
	        int pid = sc.nextInt();

	        System.out.print("Size: ");
	        String size = sc.next();

	        System.out.print("Quantity: ");
	        int qty = sc.nextInt();

	        Connection con = DBConnection.getConnection();

	        PreparedStatement ps = con.prepareStatement(
	            "INSERT INTO variants (product_id, size, quantity) VALUES (?,?,?)"
	        );

	        ps.setInt(1, pid);
	        ps.setString(2, size);
	        ps.setInt(3, qty);

	        ps.executeUpdate();
	        System.out.println("Stock Added!");
	    }

	    public static void viewInventory(Scanner sc) throws Exception {
	        Connection con = DBConnection.getConnection();

	        PreparedStatement ps = con.prepareStatement(
	            "SELECT p.product_name, v.size, v.quantity, p.price " +
	            "FROM products p JOIN variants v ON p.product_id=v.product_id " 
	        );


	        ResultSet rs = ps.executeQuery();

	        while (rs.next()) {
	            System.out.println("\nProduct name: "+rs.getString(1) +
	                "\nSize:" + rs.getString(2) +
	                "\nQty:" + rs.getInt(3) +
	                "\nPrice:" + rs.getInt(4));
	        }
	    }
	}


