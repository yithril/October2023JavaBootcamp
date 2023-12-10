package org.example;

public class FuelCleaner {
    private OilFilter oilFilter;

    FuelCleaner(OilFilter oilFilter) {
        this.oilFilter = oilFilter; // Dependency passed in constructor
    }

    void cleanFuelSystem() {
        oilFilter.filterOil();
        System.out.println("Cleaning fuel system.");
    }
}
