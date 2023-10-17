package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mainVariable = 10;

        System.out.println("Main method:");
        System.out.println("mainVariable = " + mainVariable);

        if (mainVariable > 5) {
            int ifBlockVariable = 20;
            System.out.println("Inside if block:");
            System.out.println("ifBlockVariable = " + ifBlockVariable);
        }

        for (int i = 0; i < 2; i++) {
            int forLoopVariable = i * 5;
            System.out.println("Inside for loop:");
            System.out.println("forLoopVariable = " + forLoopVariable);
        }
        anotherMethod();
    }

    public static void anotherMethod() {
        int mainVariable = 50;
        System.out.println("Inside anotherMethod:");
        System.out.println("mainVariable = " + mainVariable);
    }
}