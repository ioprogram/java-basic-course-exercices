package it.ioprogrammatore.java.module.exceptions;

/*
Objective: Understand how to handle arithmetic exceptions.
Problem: Write a Java program that attempts to divide two integers and handles the ArithmeticException that occurs when dividing by zero. Print an appropriate message when the exception is caught.
 */

public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
