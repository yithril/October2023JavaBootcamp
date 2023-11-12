package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assetCollection = new ArrayList<>();
        ArrayList<House> houseCollection = new ArrayList<>();

        House mansion = new House("My summer palace", "10/01/2023",
                300000, "123 Baller St.", 1, 5000, 6000);

        Vehicle bugatti = new Vehicle("W16 Mistral", "12/01/2010", 25000, "Bugatti",
                2, 25000);

        assetCollection.add(mansion);
        assetCollection.add(bugatti);

        houseCollection.add(mansion);

        for(House house : houseCollection){
            var asset = ((Asset) house);

            System.out.println(asset.getValue());
        }


        for (Asset asset : assetCollection) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Acquisition Date: " + asset.getDateAcquired());
            System.out.println("Acquisition Cost: " + asset.getOriginalCost());
            System.out.println("Current Value: " + asset.getValue());

            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("Address: " + house.getAddress());
            }
            if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Year: " + vehicle.getYear());
                System.out.println("Make/Model: " + vehicle.getMakeModel());
            }

            System.out.println();
        }

    }
}