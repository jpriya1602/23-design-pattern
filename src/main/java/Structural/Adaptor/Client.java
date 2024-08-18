package Structural.Adaptor;

public class Client {
    public static void main(String[] args) {
        OldPaymentGateway oldPaymentGateway = new PaymentGatewayAdapter(new NewPaymentGateway(), "RUPEE");
        boolean success = oldPaymentGateway.processPayment(100);

        if (success) {
            System.out.println("Payment processed successfully.");
        } else {
            System.out.println("Payment failed.");
        }
    }
}
