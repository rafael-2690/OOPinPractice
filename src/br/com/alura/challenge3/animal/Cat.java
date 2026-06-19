package br.com.alura.challenge3.animal;

public class Cat extends Animal {

    @Override
    public void emitSound() {
        System.out.println("Miau miau miau...");
    }

    public void scratchingFurniture(){
        System.out.println("Scratched the furniture");
    }
}
