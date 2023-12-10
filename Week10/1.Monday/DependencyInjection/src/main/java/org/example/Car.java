package org.example;

public class Car {
    private Engine engine;

    Car(String engineType) {
        if (engineType.equals("Gasoline")) {
            OilFilter oilFilter = new OilFilter();
            FuelCleaner cleaner = new FuelCleaner(oilFilter);
            this.engine = new GasolineEngine(cleaner);
        } else if (engineType.equals("Electric")) {
            BatteryHealthMonitor monitor = new BatteryHealthMonitor();
            BatteryChecker checker = new BatteryChecker(monitor);
            this.engine = new ElectricEngine(checker);
        }
    }

    void start() {
        engine.performMaintenance();
        engine.start();
        System.out.println("Car started with " + engine.getClass().getSimpleName());
    }
}
