package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        Pigeon pigeon = new Pigeon();
        Penguin penguin = new Penguin();
        Helicopter helicopter = new Helicopter();

        eagle.fly();
        pigeon.fly();

        //polymorphism
        ArrayList<Fly> flyingObjects = new ArrayList<>();

        flyingObjects.add(eagle);
        flyingObjects.add(pigeon);
        flyingObjects.add(helicopter);
        //flyingObjects.add(penguin);

        for(Fly flyingThing : flyingObjects){
            flyingThing.fly();
        }
    }
}