package src.models;

public class Coupon {

    private String code;
    private double discountPercentage;

    public Coupon(String code, double discountPercentage) {
        this.code = code;
        this.discountPercentage = discountPercentage;
    }

    public String getCode() {
        return code;
    }

    public double applyDiscount(double total) {
        return total - (total * discountPercentage / 100);
    }
}