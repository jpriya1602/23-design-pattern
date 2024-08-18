package Structural.Adaptor;

public class PaymentGatewayAdapter extends OldPaymentGateway {
    NewPaymentGateway newPaymentGateway;
    String currency;

    public PaymentGatewayAdapter(NewPaymentGateway newPaymentGateway, String currency){
        this.newPaymentGateway = newPaymentGateway;
        this.currency = currency;
    }

    @Override
    public boolean processPayment(int amount){
        String transactionId = newPaymentGateway.pay(amount,currency);
        return transactionId != null;
    }
}
