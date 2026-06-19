package br.com.alura.challenge2.product;

public class TestProduct {
    public static void main(String[] args) {
        Product p1 = new Product();

        p1.setName("Banana");
        p1.setPrice(5.99);
        p1.applyDiscount(50);

        System.out.println("The product price is: " + p1.getPrice());
        System.out.println(p1.applyDiscount(5));
    }
}
