package org.example;

public class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeSound(){
        System.out.println("Animal sound!!!!");
    }

    public void eat(){
        System.out.println("The animal eats.");
    }
}
