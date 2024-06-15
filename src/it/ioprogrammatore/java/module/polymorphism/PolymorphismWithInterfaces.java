package it.ioprogrammatore.java.module.polymorphism;

/*
Objective: Understand polymorphism using interfaces.
Problem: Write a Java program that demonstrates polymorphism by creating an interface Shape with a method draw(), and two classes Circle and Rectangle that implement the Shape interface by providing their own implementation of the draw() method. Create an array of Shape objects that includes both Circle and Rectangle objects, and call the draw() method on each object in the array.
 */

public class PolymorphismWithInterfaces {
    public static void main(String[] args) {
        // Create an array of Shape objects
        Shape[] shapes = {
                new Circle(),
                new Rectangle(),
                new Circle(),
                new Rectangle()
        };

        // Call the draw() method on each Shape object
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}

// Interface Shape
interface Shape {
    void draw();
}

// Class Circle implementing Shape interface
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Class Rectangle implementing Shape interface
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
