package it.ioprogrammatore.java.module.polymorphism;

/*
Objective: Understand polymorphism using inheritance.
Problem: Write a Java program that demonstrates polymorphism by creating a superclass Animal with a method makeSound(), and two subclasses Dog and Cat that override the makeSound() method. Create an array of Animal objects that includes both Dog and Cat objects, and call the makeSound() method on each object in the array.
 */

public class PolymorphismWithInheritance {
    public static void main(String[] args) {
        // Create an array of Animal objects
        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Dog(),
                new Cat()
        };

        // Call the makeSound() method on each Animal object
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}

// Superclass Animal
class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Subclass Dog
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
