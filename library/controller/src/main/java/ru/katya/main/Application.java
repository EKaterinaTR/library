package ru.katya.main;

import com.google.gson.Gson;
import ru.katya.library.Book;

import java.util.List;


public class Application {
    public static void main(String[] args) {
        if (args.length > 0) {
            String nameOfAuthor = args[0];
            Library library = LibraryFactory.getLibrary();
            List<Book> books = library.getBooksByAuthor(nameOfAuthor);
            Gson gson = new Gson();
            for (Book book : books) {
                System.out.println(gson.toJson(book));
            }
        }
        else {
            System.out.println("Author's name was not written");
        }

    }
}
