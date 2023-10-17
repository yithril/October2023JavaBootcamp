package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("src/main/resources/poem.txt");

            Scanner scanner = new Scanner(fis);

            String input;
            while(scanner.hasNextLine()) {
                input = scanner.nextLine();
                System.out.println(input);
            }
        }
        catch(FileNotFoundException ex){
            ex.printStackTrace();
        }

    }
}