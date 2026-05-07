package src.payments;

public class PayPalPayment implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal Payment...");
        System.out.println("₹" + amount + " paid using PayPal");
    }
}