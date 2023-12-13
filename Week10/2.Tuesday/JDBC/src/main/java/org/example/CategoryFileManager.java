package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryFileManager {
    public List<Category> getAllCategories(String username, String password){
        //Connect to the database
        //Connection string
        String url = "jdbc:mysql://localhost:3306/northwind";
        //String url = "jdbc:mysql://my06.winhost.com:3306/mysql_127681_studentdb";
        List<Category> categories = new ArrayList<>();

        //Write our query as if it were just SQL
        String query = "SELECT * FROM categories WHERE CategoryName = ? OR CategoryName = ?";

        //We're going to send our query to the database
        //using statement
        try(Connection conn = DriverManager.getConnection(url, username, password);
            PreparedStatement ps = conn.prepareStatement(query)){

            ps.setString(1, "Beverages");
            ps.setString(2, "Produce");

            //If everything goes right, we will take the SQL table and loop through it
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                int categoryID = rs.getInt("CategoryID");
                String categoryName = rs.getString("CategoryName");
                String description = rs.getString("Description");

                Category category = new Category(categoryID, categoryName, description);
                categories.add(category);
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

        return categories;
    }
}
