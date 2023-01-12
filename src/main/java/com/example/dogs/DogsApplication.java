package com.example.dogs;

import com.example.dogs.model.Dog;
import com.example.dogs.model.Person;
import com.example.dogs.repositories.DogRepository;
import com.example.dogs.repositories.PersonRepository;
import com.example.dogs.service.DogService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DogsApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(DogsApplication.class, args);

        DogRepository dogRep = context.getBean(DogRepository.class);
        PersonRepository personRepo = context.getBean((PersonRepository.class));
        DogService dogService = context.getBean(DogService.class);

        Dog spot = dogRep.findDogByName("Spot");

        Person mia = personRepo.findByname("Mia");

        dogService.updateDogOwner(spot, mia);
    }
}
