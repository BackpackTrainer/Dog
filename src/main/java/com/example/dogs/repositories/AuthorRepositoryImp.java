package com.example.dogs.repositories;


import com.example.dogs.model.Author;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class AuthorRepositoryImp implements AuthorRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Author save(Author author) {
        entityManager.persist(author);
        return author;
    }

    @Override
    public Author update(Author author) {
        entityManager.merge(author);
        return  author;
    }
}
