package com.example.dogs.service;

import com.example.dogs.model.Person;
import com.example.dogs.repositories.PersonRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    @Transactional
    public Person save(Person person) {
        personRepository.save(person);
        return person;
    }

}
