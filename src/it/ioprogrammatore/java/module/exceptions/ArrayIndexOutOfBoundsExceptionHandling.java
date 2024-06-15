package it.ioprogrammatore.java.module.exceptions;

/*
Objective: Understand how to handle array index out of bounds exceptions.
Problem: Write a Java program that attempts to access an invalid index of an array and handles the ArrayIndexOutOfBoundsException that occurs. Print an appropriate message when the exception is caught.
 */

public class ArrayIndexOutOfBoundsExceptionHandling {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            int invalidIndexValue = numbers[10];
            System.out.println("Value: " + invalidIndexValue);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        }
    }
}
