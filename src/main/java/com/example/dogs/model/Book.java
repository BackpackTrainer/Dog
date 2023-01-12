package com.example.dogs.model;

import jakarta.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue
    Long id;

    private String name;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
    private String Isbn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String isbn) {
        Isbn = isbn;
    }
}
