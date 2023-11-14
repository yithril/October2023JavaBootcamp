package org.example;

import java.math.BigDecimal;

public class Product {
    private BigDecimal price;
    private DiscountStrategy discountStrategy;

    public Product(BigDecimal price, DiscountStrategy discountStrategy){
        this.price = price;
        this.discountStrategy = discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy){
        this.discountStrategy = discountStrategy;
    }

    public BigDecimal getPrice(){
        return discountStrategy.applyDiscount(price);
    }
}
