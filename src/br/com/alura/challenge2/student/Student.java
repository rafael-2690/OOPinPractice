package br.com.alura.challenge2.student;

public class Student {
    private String name;
    private double note1;
    private double note2;
    private double note3;
    private double note4;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNote1() {
        return note1;

    }

    public double getNote2() {
        return note2;
    }

    public double getNote3() {
        return note3;
    }

    public double getNote4() {
        return note4;
    }

    public void setNotes(double n1, double n2, double n3, double n4) {
        this.note1 = n1;
        this.note2 = n2;
        this.note3 = n3;
        this.note4 = n4;
    }

    public double calculateAverage(){
        return (note1 + note2 + note3 + note4) / 4;
    }
}
