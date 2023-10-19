package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<>();

        groceryList.add("Eggs"); // index 0
        groceryList.add("Milk"); //index 1
        groceryList.add("Nutella"); //index 2

        //add items at a specific index if you want
        groceryList.add(1, "Oranges");

        for(int i = 0; i < groceryList.size(); i ++){
            System.out.println(groceryList.get(i));
        }

        groceryList.remove("Milk");

        groceryList.remove("Banana");

        for(String item : groceryList){
           // System.out.println(item);
        }

        //To recap
        //add, remove, size, get
    }
}