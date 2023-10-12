package org.example;

public class Fruit {
    private String name;
    private boolean isSweet;

    public Fruit(String name, boolean isSweet) {
        this.name = name;
        this.isSweet = isSweet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSweet() {
        return isSweet;
    }

    public void setSweet(boolean sweet) {
        isSweet = sweet;
    }
}
