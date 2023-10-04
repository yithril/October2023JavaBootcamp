package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your favorite color?");

        String favoriteColor = scanner.nextLine();

        if(favoriteColor.equalsIgnoreCase("Blue")){
            System.out.println("You are a calm person.");
        }
        else if(favoriteColor.equalsIgnoreCase("Red")){
            System.out.println("You are a mean person");
        }
        else if(favoriteColor.equalsIgnoreCase("Yellow")){
            System.out.println("You are a happy person.");
        }
        else {
            System.out.println("That's a pretty color, but it isn't special.");
        }
    }
}