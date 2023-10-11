package org.example;

public class Main {
    public static void main(String[] args) {
        Food food = new Food("Great", true, "Apple");
        food.eat();

        food.eat("quickly");
    }
}