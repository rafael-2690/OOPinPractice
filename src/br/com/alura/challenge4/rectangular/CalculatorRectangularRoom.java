package br.com.alura.challenge4.rectangular;

public class CalculatorRectangularRoom implements GeometricCalculation {
    @Override
    public void calculateArea(int width, int height) {
        System.out.println("The area is: " + width * height);
    }
    public void calculatePerimeter(int width, int height) {
        System.out.println("The perimeter is: " + (width * 2) + (height * 2) );
    }
}
