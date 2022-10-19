package ru.katya.main;

import ru.katya.library.Author;
import ru.katya.library.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LibraryFactory {
    public static Library getLibrary() {
        return getDefault();
    }

    private static Library getDefault() {
        Book book = Book.builder().authors(Set.of()).name("Fairy tail").build();
        Book book2 = Book.builder().authors(Set.of(Author.builder().name("Peter").build())).name("Peter's book").build();
        Book book3 = Book.builder().authors(Set.of(Author.builder().name("Mary").build())).name("Mary's book").build();
        Book book4 = Book.builder().authors(Set.of(Author.builder().name("Mary").build(), Author.builder().name("Peter").build())).name("Mary and Peter's book").build();
        List<Book> books = List.of(book, book2, book3, book4);
        return Library.builder().books(books).build();
    }
}
