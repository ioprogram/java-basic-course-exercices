package it.ioprogrammatore.java.module.overloading;

/*
Objective: Understand constructor overloading.
Problem: Write a Java program that demonstrates constructor overloading by creating a class Rectangle with three constructors:
- A default constructor that sets width and height to 1.
- A constructor that sets width and height to the same value.
- A constructor that sets width and height to different values.
Create instances of the Rectangle class using each constructor and print the dimensions.
 */

public class ConstructorOverloading {
    public static void main(String[] args) {
        // Create instances of Rectangle using different constructors
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(5);
        Rectangle rect3 = new Rectangle(4, 6);

        // Print the dimensions of each rectangle
        System.out.println("Rectangle 1 (default): " + rect1);
        System.out.println("Rectangle 2 (square): " + rect2);
        System.out.println("Rectangle 3 (rectangle): " + rect3);
    }
}

class Rectangle {
    private int width;
    private int height;

    // Default constructor
    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    // Constructor for square
    public Rectangle(int side) {
        this.width = side;
        this.height = side;
    }

    // Constructor for rectangle
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Width: " + width + ", Height: " + height;
    }
}
