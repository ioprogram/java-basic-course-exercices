package it.ioprogrammatore.java.module.controlflow;

/*
Objective: Use the enhanced for loop (also known as the "for-each" loop).
Problem: Write a Java program that iterates over an array of integers and prints each element.
 */

public class EnhancedForLoopExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
