package com.example.dogs.repositories;

import com.example.dogs.model.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepositoryImp implements BookRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Book save(Book book) {
        entityManager.persist(book);
        return book;
    }

    @Override
    public Book update(Book book) {
        entityManager.merge(book);
        return book;
    }
}
