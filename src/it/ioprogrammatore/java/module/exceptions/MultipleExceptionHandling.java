package it.ioprogrammatore.java.module.exceptions;

/*
Objective: Understand how to handle multiple exceptions in a single try-catch block.
Problem: Write a Java program that attempts to parse an integer from a string and divide by another integer. Handle NumberFormatException and ArithmeticException in a single try-catch block. Print appropriate messages for each exception.
 */
public class MultipleExceptionHandling {
    public static void main(String[] args) {
        String str = "abc";
        int denominator = 0;

        try {
            int numerator = Integer.parseInt(str);
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (NumberFormatException | ArithmeticException e) {
            if (e instanceof NumberFormatException) {
                System.out.println("Error: Invalid number format.");
            } else if (e instanceof ArithmeticException) {
                System.out.println("Error: Division by zero is not allowed.");
            }
        }
    }
}
