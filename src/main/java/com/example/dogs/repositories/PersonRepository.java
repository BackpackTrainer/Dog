package com.example.dogs.repositories;

import com.example.dogs.model.Person;

public interface PersonRepository {
    Person save(Person person);

    Person findByname(String name);

    //public Person findBynameAndEmail(String name, String email);
}
