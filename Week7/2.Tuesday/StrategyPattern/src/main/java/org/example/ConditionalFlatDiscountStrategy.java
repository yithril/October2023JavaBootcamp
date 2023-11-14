package org.example;

import java.math.BigDecimal;

public class ConditionalFlatDiscountStrategy implements DiscountStrategy {
    private BigDecimal discountAmount;
    private BigDecimal priceThreshold;

    public ConditionalFlatDiscountStrategy(BigDecimal discountAmount, BigDecimal priceThreshold){
        this.discountAmount = discountAmount;
        this.priceThreshold = priceThreshold;
    }

    @Override
    public BigDecimal applyDiscount(BigDecimal productPrice) {
        //compareTo method is used to compare BigDecimals
        if(productPrice.compareTo(priceThreshold) >= 0){
            return productPrice.subtract(discountAmount);
        }
        else{
            return productPrice;
        }
    }
}
