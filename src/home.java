package src;

import src.models.Product;
import src.models.Coupon;
import src.models.Cart;
import src.models.Order;

import src.payments.PaymentProcessor;
import src.payments.CreditCardPayment;

public class Home {

        /**
         * @param args
         */
        public static void main(String[] args) {

                Product p1 = new Product("P101", "Laptop", 65000);
                Product p2 = new Product("P102", "Headphones", 3000);
                Product p3 = new Product("P103", "Mouse", 1500);

                Cart cart = new Cart();

                cart.addProduct(p1);
                cart.addProduct(p2);
                cart.addProduct(p3);

                cart.showCart();

                double total = cart.calculateTotal();

                System.out.println("\nOriginal Total: ₹" + total);

                Coupon coupon = new Coupon("SAVE20", 20);

                double discountedTotal = cart.applyCoupon(coupon);

                System.out.println("Discounted Total: ₹" + discountedTotal);

                PaymentProcessor payment = new CreditCardPayment();

                payment.processPayment(discountedTotal);

                Order order = new Order(cart, discountedTotal);

                order.confirmPayment();

                order.showOrderDetails();
        }
}