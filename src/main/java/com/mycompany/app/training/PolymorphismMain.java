package com.mycompany.app.training;

// PolymorphismMain.java
// PolymorphismMain class

public class PolymorphismMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        animal.makeSound(); // Output: The animal makes a sound
        dog.makeSound();   // Output: The dog woof
        cat.makeSound();    // Output: The cat meows
    }
}