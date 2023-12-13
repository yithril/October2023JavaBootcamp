package org.example;

import java.io.FileInputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       CategoryFileManager categoryFileManager = new CategoryFileManager();

       var categories = categoryFileManager.getAllCategories(args[0], args[1]);

       for(Category category : categories){
           System.out.println(category.getCategoryName());
       }
    }
}