package Structural.Adaptor;

public class OldPaymentGateway {
    public boolean processPayment(int amount){
        System.out.println("Processing payment of $" + amount + "through old payment gateway");
        return true;
    }
}
