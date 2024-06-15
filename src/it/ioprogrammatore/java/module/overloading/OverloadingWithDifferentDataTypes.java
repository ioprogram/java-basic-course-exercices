package it.ioprogrammatore.java.module.overloading;


/*
Objective: Explore method overloading with different data types.
Problem: Write a Java program that demonstrates method overloading by creating a class Concatenator with overloaded methods concat(). The concat() method should be overloaded to handle:
- Two strings
- Three strings
- A string and an integer
Create instances of the Concatenator class and call each overloaded concat() method, printing the results.
 */

public class OverloadingWithDifferentDataTypes {
    public static void main(String[] args) {
        // Create an instance of Concatenator
        Concatenator concat = new Concatenator();

        // Call the overloaded concat() methods and print the results
        System.out.println("Concatenation of two strings (\"Hello\", \"World\"): " + concat.concat("Hello", "World"));
        System.out.println("Concatenation of three strings (\"Java\", \"is\", \"fun\"): " + concat.concat("Java", "is", "fun"));
        System.out.println("Concatenation of a string and an integer (\"Number\", 42): " + concat.concat("Number", 42));
    }
}

class Concatenator {
    // Method to concatenate two strings
    public String concat(String a, String b) {
        return a + b;
    }

    // Method to concatenate three strings
    public String concat(String a, String b, String c) {
        return a + b + c;
    }

    // Method to concatenate a string and an integer
    public String concat(String a, int b) {
        return a + b;
    }
}
