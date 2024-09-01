package Behavioural.Strategy;

public class CheckoutContext {
    PaymentStrategy paymentStrategy;
    public CheckoutContext(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void paymentAmount(Float amount){
        paymentStrategy.pay(amount);
    }

    public static void main(String[] args) {
        PaymentStrategy creditCardPaymentStrategy = new CreditCardPayment();
        CheckoutContext checkoutContext = new CheckoutContext(creditCardPaymentStrategy);
        checkoutContext.paymentAmount(5000F);
    }
}
