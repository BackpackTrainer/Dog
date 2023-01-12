package com.example.dogs.repositories;

import com.example.dogs.model.Dog;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class DogRepositoryImpl implements DogRepository {


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Dog save(Dog dog) {
        entityManager.persist(dog);
        return dog;
    }

    @Override
    public Dog updateDog(Dog d) {
        return entityManager.merge(d);
    }

    @Override
    public Dog findDogByName(String name) {

        Dog dog = entityManager.createQuery("SELECT d from Dog d WHERE d.name = :name", Dog.class).
                setParameter("name", name).getSingleResult();
        return dog;
    }
}
