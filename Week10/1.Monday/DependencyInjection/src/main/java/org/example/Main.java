package org.example;

public class Main {
    public static void main(String[] args) {
        OilFilter oilFilter = new OilFilter();
        FuelSensor fuelSensor = new FuelSensor();
        FuelCleaner fuelCleaner = new FuelCleaner(oilFilter, fuelSensor);
        GasolineEngine gasolineEngine = new GasolineEngine(fuelCleaner);
        Car car = new Car(gasolineEngine);
    }
}