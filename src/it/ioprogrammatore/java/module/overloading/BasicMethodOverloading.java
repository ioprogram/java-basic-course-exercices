package it.ioprogrammatore.java.module.overloading;

/*
Objective: Understand the basics of method overloading.
Problem: Write a Java program that demonstrates method overloading by creating a class MathOperations with overloaded methods multiply(). The multiply() method should be overloaded to handle:
- Two integers
- Three integers
- Two double values
Create instances of the MathOperations class and call each overloaded multiply() method, printing the results.
 */

public class BasicMethodOverloading {
    public static void main(String[] args) {
        // Create an instance of MathOperations
        MathOperations mathOps = new MathOperations();

        // Call the overloaded multiply() methods and print the results
        System.out.println("Product of two integers (2, 3): " + mathOps.multiply(2, 3));
        System.out.println("Product of three integers (1, 2, 3): " + mathOps.multiply(1, 2, 3));
        System.out.println("Product of two double values (2.5, 3.5): " + mathOps.multiply(2.5, 3.5));
    }
}

class MathOperations {
    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to multiply three integers
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // Method to multiply two double values
    public double multiply(double a, double b) {
        return a * b;
    }
}
