package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("How old are you?");

        Scanner scanner = new Scanner(System.in);

        try{
            int userInput = scanner.nextInt();
            System.out.println("You are " + userInput + " years old.");
        }
        catch(Exception ex){
            System.out.println("That is not an integer, try again.");
            ex.printStackTrace();
        }

        System.out.println("See you later!");
    }
}