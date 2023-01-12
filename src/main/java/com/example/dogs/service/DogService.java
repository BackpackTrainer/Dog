package com.example.dogs.service;

import com.example.dogs.model.Dog;
import com.example.dogs.model.Person;
import jakarta.transaction.Transactional;

public interface DogService {
    @Transactional
    Dog save(Dog dog);

    @Transactional
    Dog updateDogOwner(Dog d, Person p);
}
