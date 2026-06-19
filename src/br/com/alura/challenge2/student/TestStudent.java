package br.com.alura.challenge2.student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Rafael");
        student.setNotes(10,9.8,7.8,8.8);
        System.out.println("Rafael's average is: " + student.calculateAverage());
    }
}
