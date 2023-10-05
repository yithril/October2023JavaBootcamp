package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What is your favorite day of the week?");

        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();
        //input normalization
        userInput = userInput.toLowerCase();

        switch(userInput){
            case "monday":
                System.out.println("That's weird bro");
                break;
            case "tuesday":
                System.out.println("That's a bit better, the week is starting");
                break;
            case "wednesday":
                System.out.println("It's hump day.");
                break;
            case "thursday":
                System.out.println("It's Friday eve!");
                break;
            case "friday":
                System.out.println("Yay it's almost the weekend!");
                break;
            case "saturday":
                System.out.println("Time to hit the beach!");
                break;
            case "sunday":
                System.out.println("Go home and relax");
                break;
            default:
                System.out.println("That's not a day of the week");
                break;
        }
    }
}