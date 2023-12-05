package org.example;

import java.util.ArrayList;
import java.util.List;

public class PeopleRepository {
    public static ArrayList<Person> getPeople(){
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Mary", "Johnson", 28, "California", 72000, "Software Developer"));
        people.add(new Person("John", "Doe", 35, "Texas", 54000, "Teacher"));
        people.add(new Person("Alice", "Wang", 42, "New York", 85000, "Architect"));
        people.add(new Person("Bob", "Smith", 30, "Florida", 62000, "Graphic Designer"));
        people.add(new Person("Sarah", "Brown", 26, "Washington", 48000, "Research Analyst"));
        people.add(new Person("Michael", "Davis", 39, "Oregon", 95000, "Physician"));
        people.add(new Person("Laura", "Garcia", 31, "Illinois", 68000, "Marketing Manager"));
        people.add(new Person("James", "Martinez", 45, "Colorado", 77000, "Engineer"));
        people.add(new Person("Emma", "Lee", 29, "Pennsylvania", 50000, "Journalist"));
        people.add(new Person("David", "Kim", 50, "Arizona", 102000, "Lawyer"));
        people.add(new Person("Olivia", "Hernandez", 34, "Nevada", 69000, "Software Developer"));
        people.add(new Person("Ethan", "Wilson", 28, "Michigan", 57000, "Teacher"));
        people.add(new Person("Charlotte", "Liu", 37, "Virginia", 93000, "Architect"));
        people.add(new Person("Daniel", "Jackson", 41, "Ohio", 64000, "Graphic Designer"));
        people.add(new Person("Sophia", "Roberts", 33, "Georgia", 52000, "Research Analyst"));
        people.add(new Person("William", "Perez", 48, "North Carolina", 105000, "Physician"));
        people.add(new Person("Isabella", "Sanchez", 27, "Massachusetts", 73000, "Marketing Manager"));
        people.add(new Person("Matthew", "Patel", 36, "Maryland", 80000, "Engineer"));
        people.add(new Person("Amelia", "Chen", 31, "Wisconsin", 58000, "Journalist"));
        people.add(new Person("Benjamin", "Thompson", 53, "Minnesota", 99000, "Lawyer"));
        people.add(new Person("Zoe", "Anderson", 29, "Louisiana", 67000, "Software Developer"));
        people.add(new Person("Jack", "Morris", 32, "Connecticut", 61000, "Teacher"));
        people.add(new Person("Lily", "Clark", 38, "Missouri", 76000, "Architect"));
        people.add(new Person("Ryan", "Rodriguez", 42, "Indiana", 63000, "Graphic Designer"));
        people.add(new Person("Mia", "Lewis", 25, "Kentucky", 47000, "Research Analyst"));
        people.add(new Person("Henry", "White", 46, "South Carolina", 89000, "Physician"));
        people.add(new Person("Lucy", "Young", 30, "Oklahoma", 72000, "Marketing Manager"));
        people.add(new Person("Nathan", "Walker", 44, "Iowa", 78000, "Engineer"));
        people.add(new Person("Harper", "Hall", 27, "Arkansas", 51000, "Journalist"));
        people.add(new Person("Samuel", "Allen", 55, "Kansas", 103000, "Lawyer"));

        return people;
    }
}
