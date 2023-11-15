package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

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

    }
}