package org.example;

public class Food {
    private String odor;
    private boolean isEdible;
    private String name;
    private String color;
    private double size;
    private double portion;

    public Food(String odor, boolean isEdible, String name) {
        this.odor = odor;
        this.isEdible = isEdible;
        this.name = name;
    }

    public Food(String odor, boolean isEdible, String name, String color, double size, double portion) {
        this.odor = odor;
        this.isEdible = isEdible;
        this.name = name;
        this.color = color;
        this.size = size;
        this.portion = portion;
    }

    public void eat(){
        System.out.println("The " + this.name + " gets eaten");
    }

    //method override
    public void eat(String speed){
        System.out.println("The " + this.name + " gets eaten " + speed);
    }

    public String getOdor() {
        return odor;
    }

    public void setOdor(String odor) {
        this.odor = odor;
    }

    public boolean isEdible() {
        return isEdible;
    }

    public void setEdible(boolean edible) {
        isEdible = edible;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPortion() {
        return portion;
    }

    public void setPortion(double portion) {
        this.portion = portion;
    }
}
