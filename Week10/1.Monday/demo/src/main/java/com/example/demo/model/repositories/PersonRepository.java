package com.example.demo.model.repositories;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonRepository {
    public List<Person> getAllPeople(){
        Person person = new Person("Jonathan", "Hop", 39);

        var peopleList = new ArrayList<Person>();
        peopleList.add(person);

        return peopleList;
    }
}
