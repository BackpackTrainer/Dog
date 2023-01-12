package com.example.dogs.repositories;

import com.example.dogs.model.Dog;
import com.example.dogs.model.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepositoryImpl implements PersonRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Person save(Person person) {
       entityManager.persist(person);
       return person;
    }

    @Override
    public Person findByname(String name) {
        Query query = entityManager.createNamedQuery("Person.findByName");
        query.setParameter("name", name);
        Person person = (Person)query.getSingleResult();
        return person;
    }

//    @Override
//    public Person findBynameAndEmail(String name, String email) {
//        Query query = entityManager.createNamedQuery("Person.findByFirstNameAndEmail");
//        query.setParameter(1, name);
//        query.setParameter(2, email);
//        Person person = (Person)query.getSingleResult();
//        return person;
//    }

//    @Override
//    public Person findByname(String name) {
//        String jpql = "SELECT p from Person p WHERE p.name = :name";
//        Person person = entityManager.createQuery(jpql, Person.class).
//                setParameter("name", name).getSingleResult();
//        return person;
//    }

}
