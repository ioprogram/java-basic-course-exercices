package it.ioprogrammatore.java.module.basics;

/*
Objective: Define and call methods.
Problem: Write a Java program that defines a method to calculate the factorial of a number and calls this method from the main method
 */

public class MethodExercise {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " is " + factorial(number));
    }

    // Method to calculate factorial
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
