package Structural.Facade;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LoanProcessor {
    List<Loan> transactions = new ArrayList<>();
    private int transactionIdCounter = 1;

    public void borrowLoan(Member member, Book book) {
        Loan loan = new Loan(String.valueOf(transactionIdCounter++), book, member, LocalDate.now(), LocalDate.now().plus(Period.ofDays(30)));
        System.out.println(loan);
        transactions.add(loan);
    }

    public void returnLoan(Loan loan){
       loan.getBook().setAvailableStatus(true);
       loan.setReturnDate(LocalDate.now());
    }

    public List<Loan> getActiveLoansForMember(Member member){
        return transactions.stream().filter(transaction -> transaction.getMember().equals(member) && transaction.getReturnDate() == null).collect(Collectors.toList());
    }

    public List<Loan> getCompletedLoansForMember(Member member){
        return transactions.stream().filter(transaction -> transaction.getMember().equals(member) && transaction.getReturnDate() != null).collect(Collectors.toList());
    }

    public void printTransactions(){
        for(Loan loan : transactions){
            String message = String.format("member %s - book %s - return Date %s ", loan.getMember().getName(), loan.getBook().getTitle(),loan.getReturnDate());
            System.out.println(message);
        }
    }
}
