package com.example.dogs.service;

import com.example.dogs.model.Author;
import com.example.dogs.model.Book;
import com.example.dogs.model.Dog;
import com.example.dogs.model.Person;
import com.example.dogs.repositories.BookRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImp implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    @Transactional
    public Book save(Book book) {
        bookRepository.save(book);
        return book;
    }


    @Override
    @Transactional
    public Book updateBookAuthor(Book book, Author author) {
        book.setAuthor(author);
        return bookRepository.update(book);
        }
}
