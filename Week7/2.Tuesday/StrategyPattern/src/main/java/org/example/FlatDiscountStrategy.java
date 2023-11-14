package org.example;

import java.math.BigDecimal;

public class FlatDiscountStrategy implements DiscountStrategy {
    private BigDecimal discountAmount;

    public FlatDiscountStrategy(BigDecimal discountAmount){
        this.discountAmount = discountAmount;
    }

    @Override
    public BigDecimal applyDiscount(BigDecimal productPrice){
        return productPrice.subtract(discountAmount);
    }
}
