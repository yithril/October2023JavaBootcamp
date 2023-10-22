package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    public ArrayList<Product> LoadProductsFromFile(){

        ArrayList<Product> products = new ArrayList<>();

        try{
            FileInputStream fileInputStream = new FileInputStream("src/main/resources/products.csv");

            Scanner scanner = new Scanner(fileInputStream);

            scanner.nextLine();

            String input;
            while(scanner.hasNextLine()){
                input = scanner.nextLine();
                String[] rowArray = input.split("\\|");

                Product product = new Product(rowArray[0], rowArray[1], Double.parseDouble(rowArray[2]), rowArray[3]);

                products.add(product);
            }
        }
        catch(FileNotFoundException ex){
            System.out.println("Hey, sorry, didn't find the file. My bad.");
        }

        return products;
    }

    public void WriteProductToFile(Product product){
        try{
            FileWriter fileWriter = new FileWriter("src/main/resources/products.csv", true);

            String productLine = String.format("%s|%s|%f|%s", product.getSku(), product.getProductName(), product.getPrice(), product.getDepartment());

            fileWriter.write(productLine);

            fileWriter.close();
        }
        catch(IOException ex){
            System.out.println("Sorry couldn't write that to the file");
        }
    }

    public void RemoveProductFromFile(String sku){
        //Grab all the products from the file
        ArrayList<Product> productList = LoadProductsFromFile();

        //Create placeholder variable to hold the product that hopefully I will find.
        Product product = null;

        //Find the product I want to remove
        for(Product p : productList){
            if(p.getSku().equals(sku)){
                product = p;
                break;
            }
        }

        //If the product was not found, then the variable product will be null
        //If the product was found, then I can remove it.

        //Remove the product from the list of products
        if(product != null){
            productList.remove(product);
        }
        else{
            System.out.printf("Did not find a product with the sku of: %s", sku);
        }

        try{
            FileWriter fw = new FileWriter("src/main/resources/products.csv");

            for(Product p : productList){
                String productLine = String.format("%s|%s|%f|%s", p.getSku(), p.getProductName(), p.getPrice(), p.getDepartment());
                fw.write(productLine);
            }

            //Nothing gets written to the file, until you do the close method.
            fw.close();
        }
        catch(IOException ex){
            System.out.println("Oops, couldn't write to the file!");
        }
    }

    public ArrayList<Product> SearchForProductsByName(String name){
        ArrayList<Product> products = LoadProductsFromFile();

        ArrayList<Product> foundProducts = new ArrayList<>();

        for(Product p : products){
            if(p.getProductName().equalsIgnoreCase(name)){
                foundProducts.add(p);
            }
        }

        return foundProducts;
    }
}
