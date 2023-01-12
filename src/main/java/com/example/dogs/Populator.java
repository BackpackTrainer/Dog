package com.example.dogs;

import com.example.dogs.model.Author;
import com.example.dogs.model.Book;
import com.example.dogs.model.Dog;
import com.example.dogs.model.Person;
import com.example.dogs.repositories.DogRepository;
import com.example.dogs.repositories.PersonRepository;
import com.example.dogs.service.AuthorService;
import com.example.dogs.service.BookService;
import com.example.dogs.service.DogService;
import com.example.dogs.service.PersonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {

    DogService dogService;
    PersonService personService;

    AuthorService authorService;

    BookService bookService;

    public Populator(DogService dogService, PersonService personService, AuthorService authorService, BookService bookService) {
        this.dogService = dogService;
        this.personService = personService;
        this.authorService = authorService;
        this.bookService = bookService;
    }

    @Override
    public void run(String... args) throws Exception {
        Person person1 = new Person();
        person1.setName("Thomas");
        person1.setEmail("thomas@fairfieldco.com");
        personService.save(person1);

        Person person2 = new Person();
        person2.setName("Mia");
        person2.setEmail("mia.barclays.com");
        personService.save(person2);

        Dog spot = new Dog();
        spot.setName("Spot");
        spot.setBreed("Mutt");
        spot.setWeight(5);
        spot.setOwner(person1);
        dogService.save(spot);

        Author firstAuthor = new Author();
        firstAuthor.setName("Poe");
        authorService.save(firstAuthor);

        Author secondAuthor = new Author();
        secondAuthor.setName("Rawlings");
        authorService.save(secondAuthor);

        Book b = new Book();
        b.setName("The Raven");
        b.setAuthor(firstAuthor);
        b.setIsbn("123-isbn");
        bookService.save(b);

        Book bb = new Book();
        bb.setName("Harry Potter");
        bb.setAuthor(firstAuthor);
        bb.setIsbn("456-isbn");
        bookService.save(bb);

    }
}
