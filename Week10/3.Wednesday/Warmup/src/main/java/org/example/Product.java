package org.example;

import java.math.BigDecimal;

//HINT change NOTHING about the product class.
public class Product {
    //We're going back to camel case
    private int productId;
    private String productName;
    private int categoryID;
    private BigDecimal unitPrice;

    public Product(int productId, String productName, int categoryID, BigDecimal unitPrice) {
        this.productId = productId;
        this.productName = productName;
        this.categoryID = categoryID;
        this.unitPrice = unitPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
}
