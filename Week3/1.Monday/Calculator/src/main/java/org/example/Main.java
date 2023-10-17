package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What is the numerator?");

        Scanner scanner = new Scanner(System.in);

        try{
            int userInput1 = scanner.nextInt(); //

            System.out.println("What is the denominator?");

            int userInput2 = scanner.nextInt(); //

            int quotient = userInput1 / userInput2; //

            System.out.println("The result is " + quotient);
        }
        catch(ArithmeticException ex){
            System.out.println("Hey buddy, you can't divide by zero");
        }
        catch(InputMismatchException ex){
            System.out.println("I need a number!");
        }
        finally{
            scanner.close();
            System.out.println("Thanks for using our calculator!");
        }


    }
}