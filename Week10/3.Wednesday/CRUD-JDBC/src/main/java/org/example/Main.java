package org.example;

public class Main {
    public static void main(String[] args) {
        //CategoryRepository cr = new CategoryRepository("jdbc:mysql://localhost:3306/northwind", args[0], args[1]);

        //Category category = new Category(10, "Bougie II", "For the bougiest");

        //cr.createCategory(category);
        //cr.updateCategory(category);

        CustomerHistoryRepository chr = new CustomerHistoryRepository("jdbc:mysql://localhost:3306/northwind", args[0], args[1]);

        var histories = chr.getCustomerHistory("ANATR");

        for(CustomerHistory customerHistory : histories){
            System.out.println("Product Name: " + customerHistory.getProductName() + " " + customerHistory.getTotal());
        }
    }
}