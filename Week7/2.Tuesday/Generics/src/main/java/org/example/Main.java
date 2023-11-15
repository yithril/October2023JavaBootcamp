package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Pair<String> pair = new Pair<>("labrador", "golden retriever");

        Pair<Integer> integerPair = new Pair<>(50, 10020);

        Pair<Boolean> booleanPair = new Pair<>(true, false);

        System.out.println("Before");
        System.out.println("Right thing: " +  pair.getRightThing());
        System.out.println("Left thing: " + pair.getLeftThing());

        pair.swap();

        System.out.println("Right thing: " + pair.getRightThing());
        System.out.println("Left thing: " + pair.getLeftThing());

        HashMap<Double, String> hashMap = new HashMap<>();
    }
}