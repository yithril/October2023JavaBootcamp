package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            FileWriter fileWriter = new FileWriter("src/main/resources/example.txt", true);

            fileWriter.write("Hey this is a cool line of text \n");
            fileWriter.write("This is another line of text! \n");
            fileWriter.write("Whatever you want \n");

            fileWriter.close();
        }
        catch(IOException ex){
            System.out.println("Could not find that path!");
        }

        try{
            FileInputStream fileInputStream = new FileInputStream("src/main/resources/yeats-poem.txt");

            Scanner scanner = new Scanner(fileInputStream);

            String input;

            while(scanner.hasNextLine()){
                input = scanner.nextLine();
                System.out.println(input);
            }
        }
        catch(FileNotFoundException ex){
            System.out.println("Could not find that file.");
        }

    }
}