package Structural.Adaptor;

import java.util.UUID;

public class NewPaymentGateway {
    public String pay(double amount, String currency) {
        System.out.println("Processing payment of " + amount + " " + currency + " through New Payment gateway");
        String transactionId =  UUID.randomUUID().toString();
        return transactionId;
    }
}
