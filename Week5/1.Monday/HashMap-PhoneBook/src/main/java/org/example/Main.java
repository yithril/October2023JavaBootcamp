package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();

        //add a key value pair
        phoneBook.put("Smith, John A.", "867-5309");
        phoneBook.put("Wallace, William", "555-1234");

        //look up something
        String lookupNumber = phoneBook.get("Smith, John A.");

        //System.out.println("Before: " + lookupNumber);

        phoneBook.put("Smith, John A.", "505-6781");

        String lookupNumber2 = phoneBook.get("Smith, John A.");

        //System.out.println("After: " + lookupNumber2);

        //other useful methods
        boolean isInHashMap = phoneBook.containsKey("Smith, Bob");

        //System.out.println(isInHashMap);

        boolean valueIsHashMap = phoneBook.containsValue("555-1234");

        //System.out.println(valueIsHashMap);

        for(String key : phoneBook.keySet()){
            System.out.println("Key: " + key + " Value: " + phoneBook.get(key));
        }

        int[] intArray = new int[5];

        Arrays.binarySearch(intArray, 2);
    }
}