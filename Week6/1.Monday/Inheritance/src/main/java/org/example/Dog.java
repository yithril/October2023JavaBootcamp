package org.example;

public class Dog extends Animal {
    private boolean isHouseTrained;

    public boolean isHouseTrained() {
        return isHouseTrained;
    }

    public void setHouseTrained(boolean houseTrained) {
        isHouseTrained = houseTrained;
    }

    public void bark(){
        System.out.println("Woof!");
    }
}
