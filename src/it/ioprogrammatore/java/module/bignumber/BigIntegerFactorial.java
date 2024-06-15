package it.ioprogrammatore.java.module.bignumber;

import java.math.BigInteger;

/*
Objective: Use the BigInteger class to handle very large numbers in practical applications.
Problem: Write a Java program that calculates the factorial of a large number (e.g., 50) using the BigInteger class. Print the result.
 */

public class BigIntegerFactorial {
    public static void main(String[] args) {
        int number = 50;
        BigInteger factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    // Method to calculate factorial using BigInteger
    public static BigInteger calculateFactorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
