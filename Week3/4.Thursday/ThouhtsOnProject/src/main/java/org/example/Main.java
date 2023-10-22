package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MainScreen ms = new MainScreen();

        ms.displayWelcomeScreen();

        Cart userCart = new Cart();

        userCart.addToCart(new Product("toothpaste"));

    }
}