package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[5];

        fruits[0] = new Fruit("Banana", true);
        fruits[1] = new Fruit("Orange", true);
        fruits[2] = new Fruit("Kumquat", false);
        fruits[3] = new Fruit("Pineapple", true);
        fruits[4] = new Fruit("Apple", true);

        Scanner scanner = new Scanner(System.in);

        System.out.println("What fruit are you looking for? I'll let you know if I have it");

        String userInput = scanner.nextLine();

        Fruit fruit = searchFruitByName(fruits, userInput);

        if(fruit == null){
            System.out.println("Sorry I don't have that.");
        }
        else{
            System.out.println("The fruit you wanted is here!");
        }
    }

    public static Fruit searchFruitByName(Fruit[] fruits, String fruitName){
        for(Fruit fruit : fruits){
            if(fruit.getName().toLowerCase().equals(fruitName.toLowerCase())){
                return fruit;
            }
        }
        //didn't find any
        return null;
    }
}