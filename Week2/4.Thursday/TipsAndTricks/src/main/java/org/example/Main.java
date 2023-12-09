package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //defensive programming
        //lets say we are presenting a menu to the user
        //you need to think about what you want them to type
        //If you have a menu, they must put in numbers
        System.out.println("Welcome to Hop Industries Bougie Grocery Store");
        System.out.println("Type in the number of the item you want");
        System.out.println("1) Pluot");
        System.out.println("2) Dragonfruit");
        System.out.println("3) Durian");

        Scanner scanner = new Scanner(System.in);
        boolean isShopping = true;

        int[] intArray = { 1, 2, 3};
        int[] intArray2 = { 1, 2, 3};

        boolean areEqual = intArray.equals(intArray2);

        System.out.println(areEqual);

        while(isShopping == true){
            System.out.println("Please select a fruit.");
            int userInput = scanner.nextInt();

            switch(userInput){
                case 1:
                    System.out.println("Pluots are plums and apricots combined");
                    isShopping = false;
                    break;
                case 2:
                    System.out.println("Dragonfruit is very spiky.");
                    break;
                case 3:
                    System.out.println("Durian is the worst smelling thing ever");
                    isShopping = false;
                    break;
                default:
                    System.out.println("You may select 1, 2, 3");
                    break;
            }
        }


    }
}