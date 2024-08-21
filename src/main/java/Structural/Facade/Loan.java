package Structural.Facade;


import java.time.LocalDate;

public class Loan {
    private String id;
    private Book book;
    private Member member;
    private LocalDate loanDate;
    private LocalDate dueDate;

    private LocalDate returnDate;

    public Loan(String id, Book book, Member member, LocalDate loanDate, LocalDate dueDate) {
        this.id = id;
        this.book = book;
        this.member = member;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
    }

    public String getId() {
        return id;
    }

    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public LocalDate getReturnDate() {
        return this.returnDate;
    }

    public void setReturnDate(LocalDate date) {
        this.returnDate = date;
    }
}
