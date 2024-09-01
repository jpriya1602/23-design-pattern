package Behavioural.Strategy;

public class PaypalPayment implements PaymentStrategy {
    @Override
    public void pay(Float amount) {
        System.out.println("Amount "+ amount +" paid using Paypal");
    }
}
