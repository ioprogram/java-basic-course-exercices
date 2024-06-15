package it.ioprogrammatore.java.module.basics;

/*
Objective: Use if-else statements and loops.
Problem: Write a Java program that checks if a number is even or odd and prints the numbers from 1 to 10 using a loop.
 */

public class ControlStructures {
    public static void main(String[] args) {
        int number = 5;

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // Print numbers from 1 to 10 using a for loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
