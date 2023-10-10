package org.example;

public class Main {
    public static void main(String[] args) {
        int dormammuHasHadEnough = 0;

       while(dormammuHasHadEnough < 20){
            System.out.println("Dormammu I've come to bargain.");

            dormammuHasHadEnough++;
            System.out.println(dormammuHasHadEnough);

            System.out.println("Dr. Strange gets killed horribly.");
        }

        for(int i = 0; i <= 6; i++){
            System.out.println("The value of i is: " + i);
        }

        for(int j = 20; j > 0; j--){
            System.out.println("The value of j is: " + j);
        }

        int sum = 0;

        for(int i = 1; i <= 10; i++){
            //Take i divide it by 3 and if the remainder is 0
            if(i % 3 == 0){
                break;
            }
            System.out.println("i is: " + i);
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}