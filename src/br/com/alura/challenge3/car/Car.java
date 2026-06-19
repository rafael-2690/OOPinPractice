package br.com.alura.challenge3.car;

public class Car {
    private String model;
    private double price1;
    private double price2;
    private double price3;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice1() {
        return price1;
    }

    public void setPrice1(double price1) {
        this.price1 = price1;
    }

    public double getPrice2() {
        return price2;
    }

    public void setPrice2(double price2) {
        this.price2 = price2;
    }

    public double getPrice3() {
        return price3;
    }

    public void setPrice3(double price3) {
        this.price3 = price3;
    }

    public void DisplayRecord(){
        System.out.printf("""
                The model car is: %s
                The price one is: %.2f
                The price two is: %.2f
                The price three is: %.2f
                """, model, price1, price2, price3);
    }

    private double highestPrice = price1;
    private double lowestPrice = price1;

    public double comparePriceHigh(){
        if (price2 > highestPrice){
            highestPrice = price2;
        }
        if (price3 > highestPrice){
            highestPrice = price3;
        }
        return highestPrice;
    }

    public double comparePriceLow() {
        if (price2 < lowestPrice){
            lowestPrice = price2;
        }
        if (price3 < lowestPrice){
            lowestPrice = price3;
        }
        return lowestPrice;
    }
}
