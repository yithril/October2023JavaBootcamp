package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi!");

        //This is a comment the computer will ignore this line
        //Strings are used for letters or mixed
        //first letter is lower case and then all first letters are capitalized
        //is called camelCase
        String fullName = "Jonathan Hop";
        String birthDate = "03/01/1984";
        String birthPlace = "Detroit";
        String address = "1234 Somewhere Street";

        //int (integer)
        int ticketsSold = 10000;

        //If we need fractions
        //float
        double productPrice = 10.57;
        double wholeNumber = 20;

        double stadiumTicketsSold = 50000;
        double ticketCost = 35;

        //+ - * /
        double moneyIMade = stadiumTicketsSold * ticketCost;

        System.out.println(moneyIMade);

        stadiumTicketsSold = 300000;
        ticketCost = 40;

        moneyIMade = stadiumTicketsSold * ticketCost;
        System.out.println(moneyIMade);

        //float is also for numbers with fractions
        float itemPrice = 10.5f;

        //binary choice or true or false situation
        boolean isPremiumMember = true;
        boolean isGoldMember = false;
    }
}
