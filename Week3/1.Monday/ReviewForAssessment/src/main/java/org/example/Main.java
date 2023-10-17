package org.example;

public class Main {
    public static void main(String[] args) {
        // + - * /
        int x = 5;
        //System.out.println(x);
        x = x - 5;
        x -= 5;
        //System.out.println(x);

        //PEMDAS
        int y = (x + 10) / 2;

        String fruit1 = "Orange";
        String fruit2 = "Orange";

        if(fruit1 == fruit2){
            //System.out.println("Fruit 1 equals Fruit 2!");
        }
        else{
            //System.out.println("Fruit 1 does not equal Fruit 2");
        }

        int[] intArray = { 1, 2, 3, 4};

        //for loops, while loops, do while loops
        for(int i = 0; i < 10; i++){
            if(i % 2 == 0){
                break;
            }
            //System.out.println(i);
        }

        int i = 0;
        while(i < 10){
            //System.out.println(i);
            i--;
        }

        int[] intArray3 = { 1, 2, 3 };

        intArray3[2] = 5;
        intArray[2] = 1000;

        int z = 5;
        System.out.println(z++);

    }
}