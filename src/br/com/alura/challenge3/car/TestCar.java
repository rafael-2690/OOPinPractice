package br.com.alura.challenge3.car;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Logan");
        car.setPrice1(45599.99);
        car.setPrice2(89500.50);
        car.setPrice3(29899.10);
        car.DisplayRecord();
        System.out.println("");
        System.out.println("The highest price is: " + car.comparePriceHigh());
        System.out.println("The lowest price is: " + car.comparePriceLow());
    }
}
