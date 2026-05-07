package src.models;

import java.util.ArrayList;

public class Cart {

    private ArrayList<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to cart");
    }

    public void removeProduct(Product product) {
        products.remove(product);
        System.out.println(product.getName() + " removed from cart");
    }

    public double calculateTotal() {
        double total = 0;

        for (Product product : products) {
            total += product.getPrice();
        }

        return total;
    }

    public double applyCoupon(Coupon coupon) {
        return coupon.applyDiscount(calculateTotal());
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void showCart() {
        System.out.println("\nCart Items:");

        for (Product product : products) {
            product.displayProduct();
        }
    }
}