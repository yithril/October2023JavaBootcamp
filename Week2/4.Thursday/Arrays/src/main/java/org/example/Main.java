package org.example;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //arrays are fixed size. Meaning they can get full.
        //we decide how many things are in the arrays (element)
        //We can store different kinsd of data, but a single array can only have one kind of data

        //the first number is at slot 0
        //java is a 0 index language
        int[] intArray = { 5, 10, 45, 100, 210, 2 };

        //the slot where a number is located is called the index
        //System.out.println(intArray[0]);

        //System.out.println(intArray[5]);

        String[] stringArray = { "Apple", "Orange", "Pear" };

        //System.out.println(stringArray[1]);

        Dog[] dogArray = { new Dog("Loki"), new Dog("Boba"), new Dog("Princess") };

        //System.out.println(dogArray[1].getName());

        //System.out.println("Before: " + intArray[1]);
        //Change element at index
        intArray[1] = 62;
        //System.out.println("After: " + intArray[1]);

        String[] fruitArray = new String[5];

        fruitArray[0] = "Banana";
        fruitArray[1] = "Oranges";
        fruitArray[2] = "Apricot";
        fruitArray[3] = "Persimmon";
        fruitArray[4] = "Kiwi";

        Arrays.sort(fruitArray);
        //System.out.println(fruitArray.length);

        //iterate - means loop through something or to go through something one by one
        //e.g. iterate through the fruitArray
        //["Banana", "Oranges", null, null, null ]
        for(int i = 0; i < fruitArray.length; i++){
            System.out.println(fruitArray[i]);
        }
        //alternate way to iterate through an array
        for(String fruit : fruitArray){
            System.out.println("I love " + fruit);
        }
    }

    public static void printArray(String[] arrayToPrint){
        for(String item : arrayToPrint){
            System.out.println(item);
        }
    }
}