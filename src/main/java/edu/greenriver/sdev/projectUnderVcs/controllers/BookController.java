package edu.greenriver.sdev.projectUnderVcs.controllers;

import edu.greenriver.sdev.projectUnderVcs.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController
{
    private List<Book> bookslist = List.of(
         new Book("Andrzej Sapkowski",
                 "The Sword of Destiny" ,
                 384),
            new Book("Randall Garrett",
                    "Lord d'Arcy Investigates",
                    229),
            new Book("Frank Herbert",
                    "Dune",
                    412),
            new Book("Joseph Murphy",
                    "Powers of the Subconscious Mind",
                    387),
            new Book("JK Rowling",
                    "Harry Potter and the Deathly Hallows",
                    607),
            new Book("Eric Carle",
                    "THe Very Hungry Caterpillar",
                    32)

    );

    @GetMapping("books")
    public List<Book> getAllBooks()
    {
        return bookslist;
    }
}
