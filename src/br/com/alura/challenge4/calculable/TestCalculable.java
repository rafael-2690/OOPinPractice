package br.com.alura.challenge4.calculable;

public class TestCalculable {
    public static void main(String[] args) {
        Book book = new Book();
        PhysicalProduct product = new PhysicalProduct();

        book.setPrice(250);
        book.setDiscount(5);
        System.out.println(book.getDiscount());
        System.out.println(book.calculateFinalPrice());
    }
}
