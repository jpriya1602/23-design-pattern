package Structural.Facade;

import java.util.List;

public class NotificationService {

    public void sendLoanSuccessNotification(Member member, Book book) {
        System.out.println(member.getName() + " has successfully borrowed book" + book.getTitle());
    }

    public void sendReturnSuccessNotification(Member member, Book book) {
        System.out.println(member.getName() + " has successfully returned book" + book.getTitle());
    }

    public void sendOverdueNotification(Member member, List<Book> overdueBooks) {
        StringBuilder res = new StringBuilder();
        for (Book book : overdueBooks) {
            if (!res.isEmpty()) {
                res.append(",");
            }
            res.append(book.getTitle());
        }

        String message = String.format("Hi %s, the following books are overdue: %s. Please try to return them on time.",
                member.getName(), res);
        System.out.println(message);

    }

    public void sendNewArrivalNotification(Member member, List<Book> newBooks) {
        StringBuilder res = new StringBuilder();
        for (Book book : newBooks) {
            if (!res.isEmpty()) {
                res.append(",");
            }
            res.append(book.getTitle());
        }
        String message = String.format("Hi %s, the following new books have arrived %s. please consider visiting", member.getName(), res);
        System.out.println(message);
    }

    public void sendReminderNotification(Member member, Book book) {
        String message = String.format("Hi %s following borrowed book %s is approaching return date, " +
                "consider returning the book on time to avoid fine", member.getName(), book.getTitle());
        System.out.println(message);
    }
}
