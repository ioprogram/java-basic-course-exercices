package it.ioprogrammatore.java.module.bignumber;

import java.math.BigInteger;

/*
Objective: Understand how to use the BigInteger class for arithmetic operations.
Problem: Write a Java program that performs basic arithmetic operations (addition, subtraction, multiplication, and division) on two large integers using the BigInteger class. Print the results of each operation.
 */

public class BigIntegerOperations {
    public static void main(String[] args) {
        // Create two BigInteger objects
        BigInteger num1 = new BigInteger("123456789012345678901234567890");
        BigInteger num2 = new BigInteger("987654321098765432109876543210");

        // Perform addition
        BigInteger sum = num1.add(num2);
        System.out.println("Sum: " + sum);

        // Perform subtraction
        BigInteger difference = num1.subtract(num2);
        System.out.println("Difference: " + difference);

        // Perform multiplication
        BigInteger product = num1.multiply(num2);
        System.out.println("Product: " + product);

        // Perform division
        BigInteger quotient = num1.divide(num2);
        System.out.println("Quotient: " + quotient);

        // Perform modulus
        BigInteger remainder = num1.mod(num2);
        System.out.println("Remainder: " + remainder);
    }
}
