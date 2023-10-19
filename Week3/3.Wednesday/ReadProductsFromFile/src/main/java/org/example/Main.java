package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("src/main/resources/products.txt");

            Scanner scanner = new Scanner(fis);

            ArrayList<InventoryItem> inventoryItems = new ArrayList<>();

            //Skip the header line
            scanner.nextLine();

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();

                String[] inventory = line.split("\\|");

                String sku = inventory[0];
                String productName = inventory[1];
                String department = inventory[3];

                double price = Double.parseDouble(inventory[2]);

                InventoryItem newItem = new InventoryItem(sku, productName, price, department);

                inventoryItems.add(newItem);
            }

            for(InventoryItem item : inventoryItems){
                System.out.printf("SKU: %s Product Name: %s Price: $%.2f Department: %s %n",
                        item.getSku(), item.getProductName(), item.getPrice(), item.getDepartment());
            }

            System.out.println("The average price of our inventory");

            double sum = 0;

            for(InventoryItem item : inventoryItems){
                sum += item.getPrice();
            }

            double average = sum / inventoryItems.size();

            System.out.println("The average price of an item is " + average);
        }
        catch(FileNotFoundException ex){
            System.out.println("File not found");
        }

    }
}