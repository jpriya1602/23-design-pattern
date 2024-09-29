package Behavioural.Interator;

import java.util.Iterator;

public class Client {

    public static void main(String[] args) {
        BookList bookList = new BookList();
        bookList.addBook(new Book("Book1", "Author1", "ISBN1"));
        bookList.addBook(new Book("Book2", "Author2", "ISBN2"));
        bookList.addBook(new Book("Book3", "Author3", "ISBN3"));


        Iterator<Book> bookIterator = bookList.iterator();
        while(bookIterator.hasNext()){
            System.out.println(bookIterator.next());
        }
    }
}
