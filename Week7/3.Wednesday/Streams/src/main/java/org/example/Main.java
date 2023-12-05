package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> database = PeopleRepository.getPeople();

        List<String> states = database.stream().map(person -> person.getState()).distinct().sorted().collect(Collectors.toList());

        //states.stream().forEach(x -> System.out.println(x));

        List<String> statesUnder50 = database.stream()
                .filter(person -> person.getYearlyIncome() <= 50000)
                .map(person -> person.getState())
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        statesUnder50.forEach(state -> System.out.println(state));
    }
}