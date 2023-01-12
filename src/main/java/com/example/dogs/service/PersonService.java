package com.example.dogs.service;

import com.example.dogs.model.Person;
import jakarta.transaction.Transactional;
import org.springframework.data.annotation.CreatedBy;

public interface PersonService {
    @Transactional
    Person save(Person person);
}



