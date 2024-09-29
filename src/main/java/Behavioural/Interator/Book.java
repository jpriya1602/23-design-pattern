package Behavioural.Interator;

public class Book{
    String title;
    String author;
    String ISBN;

    Book( String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return this.title + " by " + this.author;
    }
}
