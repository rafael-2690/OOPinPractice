package br.com.alura.challenge3.animal;

public class Dog extends Animal {
    @Override
    public void emitSound() {
        System.out.println("Au au au...");
    }

    public void wagTail(){
        System.out.println("wagged its tail");
    }
}
