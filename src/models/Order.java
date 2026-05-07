package src.models;

public class Order {

    private Cart cart;
    private double finalAmount;
    private String paymentStatus;

    public Order(Cart cart, double finalAmount) {
        this.cart = cart;
        this.finalAmount = finalAmount;
        this.paymentStatus = "PENDING";
    }

    public void confirmPayment() {
        paymentStatus = "PAID";
    }

    public void showOrderDetails() {
        System.out.println("\nOrder Summary");
        cart.showCart();
        System.out.println("Final Amount: ₹" + finalAmount);
        System.out.println("Payment Status: " + paymentStatus);
    }
}