package org.example;

public class Main {
    public static void main(String[] args) {
        //instantiated a person
        //the person variable is an instance of Person
        //its like saying an example of a Person
        Person person = new Person("John Smith");
        Person person2 = new Person("Laquanda Jackson");
        Person person3 = new Person("James Brown");

        //instance method
        person.introduce();
        person2.introduce();
        person3.introduce();

        Greeter.greetCustomer();


        String firstName = "Bob";
        String lastName = "Jones";

        String fullName = lastName + ", " + firstName;
    }
}