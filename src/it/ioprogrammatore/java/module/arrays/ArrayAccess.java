package it.ioprogrammatore.java.module.arrays;

/*
Objective: Understand how to declare, initialize, and access elements of an array.
Problem: Write a Java program that declares an array of integers, initializes it with values, and prints each element using a loop.
 */

public class ArrayAccess {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Access and print each element using a for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
