package src;

import src.models.Product;

public class Home {

    public static void main(String[] args) {

        Product p1 = new Product(
                "P101",
                "iPhone 15",
                "128GB Black Variant",
                79999.0,
                10
        );

        Product p2 = new Product(
                "P102",
                "Nike Shoes",
                "Running Shoes for Men",
                2999.0,
                25
        );

        Product p3 = new Product(
                "P103",
                "HP Laptop",
                "16GB RAM, 512GB SSD",
                65000.0,
                8
        );

        System.out.println("=================================");
        System.out.println("     WELCOME TO SHOPPER STACK");
        System.out.println("=================================");

        p1.displayProduct();
        p2.displayProduct();
        p3.displayProduct();
    }
}