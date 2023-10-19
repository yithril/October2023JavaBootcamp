package org.example;

public class Main {
    public static void main(String[] args) {
        String row = "AV1051|JBL Bluetooth Speaker|89.95|Audio Video";

        //[(0)AV1051 (1)JBL Bluetooth Speaker (2)89.95 (3)Audio Video]
        String[] dataRow = row.split("\\|");

        for(String data : dataRow){
            System.out.println(data);
        }

        String sku = dataRow[0];
        String productName = dataRow[1];
        String department = dataRow[3];

        double price = Double.parseDouble(dataRow[2]);

        //This line will throw an exception because 89.95 is not an integer
        //int price2 = Integer.parseInt(dataRow[2]);

        InventoryItem inventoryItem = new InventoryItem(sku, productName, price, department);

        System.out.println(inventoryItem);
/*
        String row2 = "AV1051,JBL Bluetooth Speaker,89.95,Audio Video";

        String[] dataRow2 = row2.split(",");

        for(String data : dataRow2){
            System.out.println(data);
        }
 */
    }
}