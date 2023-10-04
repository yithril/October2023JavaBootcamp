package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the world's great calculator app!");
        System.out.println("Give me a number to add:");

        Scanner scanner = new Scanner(System.in);
        double userNumber = scanner.nextDouble();

        System.out.println("Give me the second number:");
        double secondUserNumber = scanner.nextDouble();

        double answer = AddTwoNumbers(userNumber, secondUserNumber);

        //System.out.println("The sum of the two numbers is: " + answer);

        //System.out.println("The sum of " + userNumber + " and " + secondUserNumber + " is: " + answer);

        System.out.printf("The sum of %.2f and %.2f is: %.2f", userNumber, secondUserNumber, answer);
    }

    public static double AddTwoNumbers(double firstNumber, double secondNumber){
         double sum = firstNumber + secondNumber;
         return sum;
    }
}