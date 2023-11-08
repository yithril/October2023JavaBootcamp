package org.example;

public class Main {
    public static void main(String[] args) {
        Dog fido = new Dog();

        fido.eat();
        fido.setName("Fido");
        fido.setNumberOfLegs(4);
        fido.setExteriorType(ExteriorType.FUR);

        Cat fluffy = new Cat();

        fluffy.setName("Fluffy");
        fluffy.setNumberOfLegs(4);

        fluffy.meow();
    }
}