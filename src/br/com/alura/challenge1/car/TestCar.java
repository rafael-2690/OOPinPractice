package br.com.alura.challenge1.car;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car();

        car.setModel("Logan");
        car.setColor("red");
        car.setYear(2019);

        car.displayRecord();
        System.out.println("This car is " + car.carAge() + " years old");
    }
}
