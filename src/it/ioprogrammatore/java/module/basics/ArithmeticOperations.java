package it.ioprogrammatore.java.module.basics;

/*
Objective: Understand how to perform arithmetic operations on different data types.
Problem: Write a Java program that declares two integer variables and two double variables, performs addition, subtraction, multiplication, and division on these variables, and prints the results.
 */

public class ArithmeticOperations {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        double num3 = 7.5;
        double num4 = 2.5;

        // Integer arithmetic operations
        System.out.println("Integer Addition: " + (num1 + num2));
        System.out.println("Integer Subtraction: " + (num1 - num2));
        System.out.println("Integer Multiplication: " + (num1 * num2));
        System.out.println("Integer Division: " + (num1 / num2));

        // Double arithmetic operations
        System.out.println("Double Addition: " + (num3 + num4));
        System.out.println("Double Subtraction: " + (num3 - num4));
        System.out.println("Double Multiplication: " + (num3 * num4));
        System.out.println("Double Division: " + (num3 / num4));
    }
}
