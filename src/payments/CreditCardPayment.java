package src.payments;

public class CreditCardPayment implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment...");
        System.out.println("₹" + amount + " paid using Credit Card");
    }
}