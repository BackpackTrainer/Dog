package com.example.dogs.service;

import com.example.dogs.model.Dog;
import com.example.dogs.model.Person;
import com.example.dogs.repositories.DogRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DogServiceImpl implements DogService {
    
    @Autowired
    private DogRepository dogRepository;
    
    @Override
    @Transactional
    public Dog save(Dog dog) {
        dogRepository.save(dog);
        return dog;
    }

    @Override
    @Transactional
    public Dog updateDogOwner(Dog d, Person p) {
        System.out.println("My name is " + d.getName() + ".  My owner is " + d.getOwner().getName());
        d.setOwner(p);
        Dog updatedDog = dogRepository.updateDog(d);
        System.out.println("My name is " + updatedDog.getName() + ".  My new owner is " + updatedDog.getOwner().getName());
        return updatedDog;
    }

}
