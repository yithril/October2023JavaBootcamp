package org.example;

public class Main {
    public static void main(String[] args) {
        CellPhone cp = new CellPhone();
        cp.serialNumber = "ZYXV";
        System.out.println(cp.serialNumber);

        CellPhone cp3 = new CellPhone("ABDZDE", "Iphone 15", "Apple", "867-5309", "Bob Smith");
    }
}