package Behavioural.Interator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookList {
    private final List<Book> bookList;

    BookList() {
        bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void removeBook(Book bookToBeRemoved) {
        bookList.removeIf(book -> book.ISBN.equals(bookToBeRemoved.ISBN));
    }

    public List<Book> getBooks() {
        return new ArrayList<>(bookList);
    }

    public Iterator<Book> iterator() {
        return new BookIterator(this);
    }
}
