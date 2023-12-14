package org.example;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.*;

public class CategoryRepository {
    //CRUD functions
    //getAllX, getXById, createX, updateX, deleteX
    //Person, Category, Employee etc. I'm going to say Entity or Model

    //CREATE
    private BasicDataSource basicDataSource;

    public CategoryRepository(String url, String userName, String password){
        basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(url);
        basicDataSource.setUsername(userName);
        basicDataSource.setPassword(password);
    }

    //CREATE
    public void createCategory(Category category){
        String query = "INSERT INTO categories(CategoryName, Description) VALUES(?, ?)";

        try(Connection conn = basicDataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, category.getCategoryName());
            ps.setString(2, category.getDescription());

            ps.executeUpdate();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }

    //UPDATE
    public void updateCategory(Category category){
        String query = "UPDATE categories SET CategoryName = ? WHERE CategoryID = ?";

        try(Connection conn = basicDataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(query)){

            ps.setString(1, category.getCategoryName());
            ps.setInt(2, category.getCategoryId());

            ps.executeUpdate();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }

    public void deleteCategory(int id){
        String query = "DELETE FROM categories WHERE CategoryID = ?";

        try(Connection conn = basicDataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(query)){

            ps.setInt(1, id);

            ps.executeUpdate();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}
