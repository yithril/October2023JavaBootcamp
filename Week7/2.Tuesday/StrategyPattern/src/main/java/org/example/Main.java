package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        //5 off the price of the product
        FlatDiscountStrategy fds = new FlatDiscountStrategy(new BigDecimal("5"));

        //10% off
        PercentageDiscountStrategy pds = new PercentageDiscountStrategy(new BigDecimal("10"));

        NoDiscountStrategy nds = new NoDiscountStrategy();

        ConditionalFlatDiscountStrategy cfds = new ConditionalFlatDiscountStrategy(new BigDecimal(10), new BigDecimal(200));

        Product trufflePopcorn = new Product(new BigDecimal("100"), cfds);

        Product tuxedoPopcorn = new Product(new BigDecimal("200"), cfds);

        System.out.println(trufflePopcorn.getPrice());
        System.out.println(tuxedoPopcorn.getPrice());
    }
}