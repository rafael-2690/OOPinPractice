package br.com.alura.challenge4.calculable;

public class Book implements Calculable {

    private double price;
    private double discount;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = (discount / 100) * price;
    }

    @Override
    public double calculateFinalPrice() {
        return price - discount;
    }
}
