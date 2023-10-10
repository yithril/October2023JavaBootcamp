package org.example;

public class Main {
    public static void main(String[] args) {
        //instantiate
        //On line 7 we instantiate a Dog
        Dog dog1 = new Dog();

        dog1.name = "Loki";
        dog1.breed = "Golden Retriever";
        dog1.furColor = "Gold";
        dog1.numberOfLegs = 4;
        dog1.hasTail = true;

        //The variable dog2 on line 16 is an instance of Dog
        Dog dog2 = new Dog();
        dog2.name = "Boba";
        dog2.breed = "Eskimo";
        dog2.furColor = "Black and White";
        dog2.numberOfLegs = 4;
        dog2.hasTail = true;
    }
}