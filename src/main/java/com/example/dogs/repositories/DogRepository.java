package com.example.dogs.repositories;

import com.example.dogs.model.Dog;

public interface DogRepository {
    Dog save(Dog dog);

    Dog updateDog(Dog d);

    Dog findDogByName(String name);
}
