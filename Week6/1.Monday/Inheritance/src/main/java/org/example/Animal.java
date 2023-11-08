package org.example;

public class Animal {
    private int numberOfLegs;
    private ExteriorType exteriorType;
    private boolean isDomesticated;
    private String name;

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public ExteriorType getExteriorType() {
        return exteriorType;
    }

    public void setExteriorType(ExteriorType exteriorType) {
        this.exteriorType = exteriorType;
    }

    public boolean isDomesticated() {
        return isDomesticated;
    }

    public void setDomesticated(boolean domesticated) {
        isDomesticated = domesticated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void move(){
        System.out.println("The " + name + " moves!");
    }

    public void eat(){
        System.out.println("The " + name + " eats hungrily!");
    }
}
