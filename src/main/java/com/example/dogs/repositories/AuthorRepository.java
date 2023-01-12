package com.example.dogs.repositories;

import com.example.dogs.model.Author;

public interface AuthorRepository {
    Author save(Author author);

    Author update(Author author);
}
