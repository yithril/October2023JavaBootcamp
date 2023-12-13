package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    /*
    There are many things wrong with the following code.
    Your mission, should you choose to accept it, is to find what is wrong
    and fix it. There is nothing wrong in the Product class, so don't touch it.
    There are all manner of things wrong here.
     */
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/northwin";
        List<Product> products = new ArrayList<>();

        //did you set this configuration in the intelliJ project?
        String username = args[0];
        String password = args[1];

        String query = "SELECT * FROM Products WHERE CategoryID > ? AND UnitPrice < ?";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement ps = conn.createStatement();
             ) {

            ResultSet rs = ps.executeQuery(query);
            ps.setString(1, "Beverages");
            ps.setString(2, "20");

            while (rs.next()) {
                int productId = rs.getInt("ProductID");
                String productName = rs.getString("ProductName");
                double unitPrice = rs.getDouble("UnitPrice");

                Product product = new Product();
                products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for(Product product : products){
            System.out.printf("ProductId: %d ProductName: %s CategoryId: %d UnitPrice %f",
                            product.getProductId(),product.getProductName(), product.getCategoryID(), product.getUnitPrice());
        }
    }
}