package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isMakingSelection = true;

        while(isMakingSelection){
            System.out.println("Please select a story for me to read to you:");
            System.out.println("1) Goldilocks");
            System.out.println("2) Hansel and Gretel");
            System.out.println("3) Mary Had a Little Lamb");
            System.out.println("4) Quit");

            Scanner scanner = new Scanner(System.in);

            try{
                int userStoryChoice = scanner.nextInt();

                //DRY principle Don't Repeat Yourself
                switch(userStoryChoice){
                    case 1:
                        printFile("src/main/resources/goldilocks.txt");
                        break;
                    case 2:
                        printFile("src/main/resources/hansel_and_gretel.txt");
                        break;
                    case 3:
                        printFile("src/main/resources/mary_had_a_little_lamb.txt");
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("That's not a thing, try again.");
                        break;
                }
            }
            catch(Exception ex){
                System.out.println("Sorry, that's not a choice.");
            }
        }
    }

    public static void printFile(String fileName){
        try{
            FileInputStream fis = new FileInputStream(fileName);
            Scanner goldilocksScanner = new Scanner(fis);

            String input;
            int counter = 1;
            while(goldilocksScanner.hasNextLine()){
                input = goldilocksScanner.nextLine();
                System.out.printf("%d. %s %n", counter, input);
                counter++;
            }

            goldilocksScanner.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("File not found.");
        }
    }
}