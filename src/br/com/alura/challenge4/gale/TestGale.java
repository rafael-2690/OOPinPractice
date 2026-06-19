package br.com.alura.challenge4.gale;

public class TestGale {
    public static void main(String[] args) {
        Product product = new Product();

        product.setPrice(100);
        product.setQuantity(50);
        product.setDiscount(10);
        product.finalPrice();

    }
}
