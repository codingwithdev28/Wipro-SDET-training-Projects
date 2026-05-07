package Zudio_store;

import java.sql.*;
import java.util.Scanner;

public class SearchService {

    public static void searchByCategory(Scanner sc) throws Exception {

        Connection con = DBConnection.getConnection();

        System.out.print("Enter Category: ");
        String category = sc.nextLine();

        PreparedStatement ps = con.prepareStatement(

            "SELECT p.product_name, v.size, v.quantity, p.price " +
            "FROM products p " +
            "JOIN variants v ON p.product_id = v.product_id " +
            "WHERE p.category = ?"
        );

        ps.setString(1, category);

        ResultSet rs = ps.executeQuery();

        System.out.println("\n   Products   ");

        while (rs.next()) {

            System.out.println(
                rs.getString("product_name") +
                " | Size: " + rs.getString("size") +
                " | Qty: " + rs.getInt("quantity") +
                " | Price: " + rs.getInt("price")
            );
        }
    }
        public static void searchBySize(Scanner sc) throws Exception {
 
            Connection con = DBConnection.getConnection();

            System.out.print("Enter Size: ");
            String size = sc.nextLine();

            PreparedStatement ps = con.prepareStatement(

                "SELECT p.product_name, p.category, v.quantity, p.price " +
                "FROM products p " +
                "JOIN variants v ON p.product_id = v.product_id " +
                "WHERE v.size = ?"
            );

            ps.setString(1, size);

            ResultSet rs = ps.executeQuery();

            System.out.println("\n    Products  ");

            while (rs.next()) {

                System.out.println(
                    rs.getString("product_name") +
                    " | Category: " + rs.getString("category") +
                    " | Qty: " + rs.getInt("quantity") +
                    " | Price: " + rs.getInt("price")
                );
            }
         }

}
