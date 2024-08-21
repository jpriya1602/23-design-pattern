package Structural.Facade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Catalog {
    List<Book> books = new ArrayList<>();

    int bookIdCounter = 1;

    public void addBookToCatalog(String title, String author, String ISBN) {
        Book book = new Book(String.valueOf(bookIdCounter++), title, author, ISBN, true);
        System.out.println("Added " + book.getTitle() + "to the catalog");
        books.add(book);
    }

    public Book searchBookByTitle(String title) {
        return books.stream()
                .filter(book -> book.getTitle().equals(title))
                .findFirst()
                .orElse(null);
    }

    public List<Book> searchByAvailableStatus(boolean status) {
        return books.stream()
                .filter(book -> book.getAvailableStatus() == status)
                .collect(Collectors.toList());
    }

    public void updateBookStatus(String id) {
        books.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst()
                .ifPresent(book -> book.setAvailableStatus(!book.getAvailableStatus()));

        System.out.println("Successfully updated book status");
    }

}
