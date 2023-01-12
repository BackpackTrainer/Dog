package com.example.dogs.service;

import com.example.dogs.model.Author;
import com.example.dogs.model.Book;
import jakarta.transaction.Transactional;

public interface BookService {
    @Transactional
    Book save(Book book);

    @Transactional
    Book updateBookAuthor(Book book, Author author);
}
