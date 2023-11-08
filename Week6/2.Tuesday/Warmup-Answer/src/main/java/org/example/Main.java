package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animalList = new ArrayList<>();

        Dog dog = new Dog("fido", "Golden Retriever");

        Cat cat = new Cat("pancake");

        //can't do this
        //catList.add(dog);

        animalList.add(cat);
        animalList.add(dog);

        Animal newAnimal = new Dog("fluffy", "German Shephard");

        newAnimal.makeSound();

        newAnimal = new Cat("whiskers");

        newAnimal.eat();

        animalList.add(newAnimal);

        for(Animal animal : animalList){
            if(animal instanceof Dog){
                //casting
                ((Dog) animal).howl();
            }
            else{
                ((Cat) animal).makeSound();
            }
        }
    }
}