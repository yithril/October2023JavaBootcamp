package org.example;

public class House extends Asset {
    private String address;
    private int condition;
    private int squareFeet;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFeet, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFeet = squareFeet;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        if(condition < 1 || condition > 4){
            throw new IllegalArgumentException("Invalid quality value.");
        }

        this.condition = condition;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue(){
        var lotPrice = this.lotSize * .25;
        switch(condition){
            case 1:
                return 180 * this.squareFeet + lotPrice;
            case 2:
                return 130 * this.squareFeet + lotPrice;
            case 3:
                return 90 * this.squareFeet + lotPrice;
            case 4:
                return 80 * this.squareFeet + lotPrice;
            default:
                throw new IllegalArgumentException("Invalid quality value.");
        }
    }
}
