package Behavioural.Strategy;

public class CryptoPayment implements PaymentStrategy{
    @Override
    public void pay(Float amount) {
        System.out.println("Amount "+ amount +" paid using Crypto payment");
    }
}
