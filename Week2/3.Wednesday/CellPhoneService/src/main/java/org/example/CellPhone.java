package org.example;

public class CellPhone {
    public String serialNumber;
    public String model;
    public String carrier;
    public String phoneNumber;
    public String owner;

    //parameterless constructor
    public CellPhone(){
        this.serialNumber = "ABCDE";
    }

    public CellPhone(String serialNumber, String model, String carrier, String phoneNumber, String owner){
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    public CellPhone(String serialNumber, String model, String carrier){
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
    }
}
