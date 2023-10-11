package org.example;

public class Main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();

        //instead of doing ba.owner =
        ba.setOwner("Jonathan Hop");

        System.out.println("The owner is: " + ba.getOwner());
    }
}