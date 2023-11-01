package org.example;

public class Room {
    //properties first
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    //write your constructor(s)
    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty){
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    //getters and setters
    public int getNumberOfBeds(){
        return this.numberOfBeds;
    }

    public double getPrice(){
        return this.price;
    }

    public boolean isDirty(){
        return this.isDirty;
    }

    public boolean isOccupied(){
        return this.isOccupied;
    }

    //derived getter
    public boolean isAvailable(){
        if(this.isOccupied == false && this.isDirty == false){
            return true;
        }
        else{
            return false;
        }
        //return !isOccupied && !isDirty;
    }

    //custom methods
}
