package org.example;

public class Dog {
    //properties **fields
    public String breed;
    public int numberOfLegs;
    public String furColor;
    public boolean hasTail;
    public String name;

    //constructor
    //parameterless constructor
    public Dog(){
        this.name = "Default dog name";
    }

    public Dog(String breed, int numberOfLegs, String furColor, boolean hasTail, String name){
        this.breed = breed;
        this.numberOfLegs = numberOfLegs;
        this.furColor = furColor;
        this.hasTail = hasTail;
        this.name = name;
    }

    public String getBreed() {
        return "This breed is " + breed;
    }

    //1. access modifier (public, private) comes first
    //2. What data types does my method return?
    //3. What do you want to name the method? after the name put parenthesis
    //4. IF your method returns something, include the return keyword and the data you want to give back
    public String bark(){ //Line 15 is the method signature
        return "Woof! My name is " + this.name;
    }

    //void is when we don't return any data
    public void wagTail(){
        System.out.println(this.name + " happily wags its tail!");
    }

    //The variables inside the parenthesis are called arguments or parameters
    public void eat(String food){
        System.out.println(this.name + " eats " + food);
    }
}
