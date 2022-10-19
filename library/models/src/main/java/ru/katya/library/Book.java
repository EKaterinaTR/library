package ru.katya.library;

import lombok.*;
import java.util.Set;

@Data
@Builder
public class Book {
    @NonNull
    Set<Author> authors;
    String name;
    Integer numberOfPages;
}
