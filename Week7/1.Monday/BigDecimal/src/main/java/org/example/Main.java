package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("100.5");
        BigDecimal bd2 = new BigDecimal("10.25");

        BigDecimal sum = bd1.add(bd2);
        BigDecimal difference = bd1.subtract(bd2);
        BigDecimal product = bd1.multiply(bd2);

        BigDecimal quotient = bd1.divide(bd2, 2, BigDecimal.ROUND_HALF_UP);

        //If you're working with doubles or floats, avoid using the constructor
        BigDecimal money1 = BigDecimal.valueOf(.3);
        BigDecimal money2 = BigDecimal.valueOf(.2);
        BigDecimal money3 = money1.subtract(money2);

        //System.out.println(money3);

        //No more greater less than < > <= >=
        //compare
        int compareResult = bd1.compareTo(bd2);
        int compareResult2 = bd2.compareTo(bd1);

        //compare result gives 3 possible values back
        //1 means the first number is bigger than the second
        //-1 means the first number is less than the second
        //0 means theyre equal
        System.out.println(compareResult); //100.5 compared to 10.5
        System.out.println(compareResult2); //10.5 compared to 100.5

        //rounding
        BigDecimal weirdNumber = new BigDecimal("10.785239183");

        BigDecimal roundedValue = weirdNumber.setScale(2, RoundingMode.HALF_UP);

        System.out.println(roundedValue);
    }
}