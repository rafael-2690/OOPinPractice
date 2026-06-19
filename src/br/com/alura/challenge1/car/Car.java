package br.com.alura.challenge1.car;

public class Car {
    private String model;
    private String color;
    private int year;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayRecord(){
        System.out.printf("""
                The model is: %s
                The color is: %s
                The year is: %d
                """, model, color, year);
    }

    public int carAge(){
        return 2026 -  year;
    }


}
