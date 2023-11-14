package org.example;

import java.math.BigDecimal;

public class PercentageDiscountStrategy implements DiscountStrategy {
    private BigDecimal discountPercentage;

    public PercentageDiscountStrategy(BigDecimal discountPercentage){
        this.discountPercentage = discountPercentage;
    }

    @Override
    public BigDecimal applyDiscount(BigDecimal productPrice){
        //this takes the discount percentage and turns into a fraction
        //then gets the total value of the original price
        //for example if the discount percentage is 10, then it'll be .1, and then
        //we'll get .9 of the original price.
        BigDecimal discountFactor = BigDecimal.ONE.subtract(discountPercentage.divide(BigDecimal.valueOf(100)));

        return productPrice.multiply(discountFactor);
    }
}
