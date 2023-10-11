package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //instantiate
        //On line 7 we instantiate a Dog
        Dog dog1 = new Dog("Golden Retriever", 4, "Gold", true, "Loki");

        //The variable dog2 on line 16 is an instance of Dog
        Dog dog2 = new Dog("Eskimo", 4, "Black and White", true, "Boba");

        Dog dog3 = new Dog("Malamute", 4, "Black and White", true, "Thor");
        //parenthesis after the name of the method invoke the function
        //you invoke functions
        //sometimes people say call functions
        //System.out.println(dog2.name.toUpperCase());

        System.out.println(dog1.bark());
        System.out.println(dog2.bark());

        String dogBark = dog1.bark();

        dog1.eat("chicken");
    }
}