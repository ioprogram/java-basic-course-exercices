package it.ioprogrammatore.java.module.bignumber;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
Objective: Understand how to use the BigDecimal class for precise arithmetic operations with floating-point numbers.
Problem: Write a Java program that performs basic arithmetic operations (addition, subtraction, multiplication, and division) on two large floating-point numbers using the BigDecimal class. Print the results of each operation.
 */

public class BigDecimalOperations2 {
    public static void main(String[] args) {
        // Create two BigDecimal objects
        BigDecimal num1 = new BigDecimal("12345.6789012345678901234567890");
        BigDecimal num2 = new BigDecimal("98765.4321098765432109876543210");

        // Perform addition
        BigDecimal sum = num1.add(num2);
        System.out.println("Sum: " + sum);

        // Perform subtraction
        BigDecimal difference = num1.subtract(num2);
        System.out.println("Difference: " + difference);

        // Perform multiplication
        BigDecimal product = num1.multiply(num2);
        System.out.println("Product: " + product);

        // Perform division with rounding
        BigDecimal quotient = num1.divide(num2, RoundingMode.HALF_UP);
        System.out.println("Quotient: " + quotient);

        // Perform division with specified scale and rounding mode
        BigDecimal preciseQuotient = num1.divide(num2, 10, RoundingMode.HALF_UP);
        System.out.println("Precise Quotient (scale 10): " + preciseQuotient);
    }
}
