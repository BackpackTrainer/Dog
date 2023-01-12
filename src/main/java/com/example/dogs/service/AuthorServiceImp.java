package com.example.dogs.service;

import com.example.dogs.model.Author;
import com.example.dogs.repositories.AuthorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImp implements AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    @Override
    @Transactional
    public Author save(Author author) {
        authorRepository.save(author);
        return author;
    }

    @Override
    @Transactional
    public Author update(Author author)  {
        authorRepository.update(author);
        return author;
    }
}
