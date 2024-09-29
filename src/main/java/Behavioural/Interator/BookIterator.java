package Behavioural.Interator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class BookIterator implements Iterator<Book> {
    private List<Book> books;
    private int index = 0;
    public BookIterator(BookList bookList){
        this.books = bookList.getBooks();
    }

    @Override
    public boolean hasNext() {
        return index < books.size();
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more books in the list.");
        }
        return books.get(index++);
    }
}