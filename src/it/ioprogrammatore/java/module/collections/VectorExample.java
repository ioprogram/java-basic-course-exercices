package it.ioprogrammatore.java.module.collections;

import java.util.Vector;

/*
Objective: Understand how to use Vector for dynamic arrays with synchronized methods.
Problem: Write a Java program that creates a Vector of strings, adds elements to the vector, removes an element, and iterates through the vector to print each element.
 */

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector of strings
        Vector<String> vector = new Vector<>();

        // Add elements to the vector
        vector.add("Element1");
        vector.add("Element2");
        vector.add("Element3");

        // Remove an element from the vector
        vector.remove("Element2");

        // Iterate through the vector and print each element
        for (String element : vector) {
            System.out.println(element);
        }
    }
}
