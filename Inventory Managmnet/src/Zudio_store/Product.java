package Zudio_store;

import java.sql.*;
import java.util.Scanner;

public class Product {

		    public static void addProduct(Scanner sc) throws Exception {
		    	
		        System.out.print("Product Name: ");
		        String name = sc.nextLine();

		        System.out.print("Category: ");
		        String cat = sc.nextLine();

		        System.out.print("Price: ");
		        int price = sc.nextInt();

		        Connection con = DBConnection.getConnection();

		        PreparedStatement ps = con.prepareStatement(
		            "INSERT INTO products (product_name, category, price) VALUES (?,?,?)"
		        );
		        ps.setString(1, name);
		        ps.setString(2, cat);
		        ps.setInt(3, price);

		        ps.executeUpdate();
		        System.out.println("Product Added!");
		    }
		}

	