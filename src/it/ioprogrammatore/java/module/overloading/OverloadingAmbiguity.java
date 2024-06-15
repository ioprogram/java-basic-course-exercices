package it.ioprogrammatore.java.module.overloading;

/*
Objective: Understand method overloading and ambiguity resolution.
Problem: Write a Java program that demonstrates method overloading by creating a class Printer with overloaded methods print(). The print() method should be overloaded to handle:
- A single integer
- A single double
- A single string
Create instances of the Printer class and call each overloaded print() method, printing the results. Also, try calling the print() method with a float argument and observe the behavior.
 */

public class OverloadingAmbiguity {
    public static void main(String[] args) {
        // Create an instance of Printer
        Printer printer = new Printer();

        // Call the overloaded print() methods
        printer.print(42);
        printer.print(3.14);
        printer.print("Hello, World!");

        // Call the print() method with a float argument
        printer.print(2.5f);  // Observe the behavior
    }
}

class Printer {
    // Method to print an integer
    public void print(int a) {
        System.out.println("Printing integer: " + a);
    }

    // Method to print a double
    public void print(double a) {
        System.out.println("Printing double: " + a);
    }

    // Method to print a string
    public void print(String a) {
        System.out.println("Printing string: " + a);
    }
}

