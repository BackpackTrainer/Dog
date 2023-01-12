package com.example.dogs.model;

import jakarta.persistence.*;

@Entity
public class Dog {

    @Id
    @GeneratedValue
    Long id;

    private String name;
    private String breed;
    private int weight;

    @ManyToOne
    @JoinColumn(name = "owner")
    private Person owner;

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
