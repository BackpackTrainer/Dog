package com.example.dogs.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@NamedQuery(name = "Person.findByName", query = "SELECT p FROM Person p WHERE p.name = :name")
@NamedQuery(name = "Person.findByFirstNameAndEmail", query = "SELECT p FROM Person p WHERE p.name = ?1 AND p.email = ?2")
public class Person {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<Dog> dogs = new ArrayList<>();

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(List<Dog> dogs) {
        this.dogs = dogs;
    }
}

//@NamedQuery(name = "Person.findByFirstNameAndEmail", query = "SELECT p FROM Person p WHERE p.name = ?1 AND p.email = ?2")