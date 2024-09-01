package Behavioural.Strategy;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay(Float amount) {
        System.out.println("Amount "+ amount +" paid using credit card");
    }
}
