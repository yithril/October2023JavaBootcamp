package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess my age! Whole numbers only");

        int userInput = scanner.nextInt();

        boolean playerWasCorrect = false;

        //Pseudo Code
        //They got it right
        //== != > < >= <=
        if(userInput == age){
            System.out.println("You got it right!");
            playerWasCorrect = true;
        }
        //They went over
        else if(userInput > age){
            System.out.println("You guessed too high.");
        }
        //They went under
        else {
            System.out.println("You guessed too low");
        }

        //working with booleans
        if(playerWasCorrect == true){
            System.out.println("Hey you're a winner!");
        }
        //Line 34 and Line 38 are the same
        if(playerWasCorrect){
            System.out.println("Hey you're also a winner!");
        }

        if(playerWasCorrect == false){
            System.out.println("You guessed incorrectly");
        }
        //Lines 42 and 46 are the same
        if(!playerWasCorrect){

        }
    }
}