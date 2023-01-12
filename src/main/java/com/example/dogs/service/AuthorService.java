package com.example.dogs.service;

import com.example.dogs.model.Author;
import jakarta.transaction.Transactional;

public interface AuthorService {
    Author save(Author author);

    @Transactional
    Author update(Author author);
}
