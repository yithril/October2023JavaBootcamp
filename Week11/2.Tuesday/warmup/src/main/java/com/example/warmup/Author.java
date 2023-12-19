package com.example.warmup;

import jakarta.persistence.*;

import java.util.Set;

//This is an example of how you would create your class
//if YOU DO NOT want to use Lombok.
//Without lombok, you must make the parameterless constructor your self
//and you must do all getters and setters
@Entity
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String name;

    //navigation property
    @OneToMany(mappedBy = "author")
    private Set<Book> books;

    //you MUST have a no args constructor
    public Author(){

    }

    public Author(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
