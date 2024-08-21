package Structural.Facade;

public class Book {
    private String id;
    private String title;
    private String author;
    private String ISBN;
    private boolean availableStatus;

    public Book(String id, String title, String author, String ISBN, boolean availableStatus) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.availableStatus = availableStatus;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setAvailableStatus(boolean availableStatus) {
        this.availableStatus = availableStatus;
    }

    public boolean getAvailableStatus(){
        return this.availableStatus;
    }
}
