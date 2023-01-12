package com.example.dogs.repositories;

import com.example.dogs.model.Book;

public interface BookRepository {
    Book save(Book book);

    Book update(Book book);
}
