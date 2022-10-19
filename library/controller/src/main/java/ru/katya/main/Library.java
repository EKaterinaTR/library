package ru.katya.main;

import lombok.Builder;
import lombok.Data;
import ru.katya.library.Book;

import java.util.List;

@Data
@Builder
public class Library {
    String name;
    List<Book> books;

    public List<Book> getBooksByAuthor(String author){
        return books.stream().filter(book -> book.getAuthors().stream().filter(x -> x.getName().equals(author)).count() > 0).toList();
    }
}
