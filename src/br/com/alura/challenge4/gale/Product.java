package br.com.alura.challenge4.gale;

public class Product implements Gale {
    private int quantity;
    private double price;
    private double discount;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = (discount / 100) * price;
    }

    @Override
    public void finalPrice() {
        double finalPrice = (price - discount) * quantity;
        System.out.println("The final price is: " + finalPrice);
    }
}
