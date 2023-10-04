package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What's your name?");

        //the scanner is to grab what the person types
        Scanner scanner = new Scanner(System.in);

        //Line 13 actually captures what the person types
        String userInput = scanner.nextLine();

        System.out.println("Hey whatsup, " + userInput);
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("Congratulations, you are " + age + " years old");
    }
}