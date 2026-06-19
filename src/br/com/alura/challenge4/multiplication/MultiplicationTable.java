package br.com.alura.challenge4.multiplication;

public class MultiplicationTable implements Table {
    @Override
    public void displayTable(int number) {
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i  + " = " + result);
        }
    }
}
