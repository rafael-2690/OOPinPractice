package br.com.alura.challenge3.animal;

public class TestAnimal {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.emitSound();
        cat.emitSound();
        dog.wagTail();
        cat.scratchingFurniture();
    }
}
