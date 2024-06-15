package it.ioprogrammatore.java.module.overloading;

/*
Objective: Understand how to use varargs in method overloading.
Problem: Write a Java program that demonstrates method overloading by creating a class SumCalculator with overloaded methods sum(). The sum() method should be overloaded to handle:
- Two integers
- A variable number of integers using varargs
Create instances of the SumCalculator class and call each overloaded sum() method, printing the results.
 */

public class OverloadingWithVarargs {
    public static void main(String[] args) {
        // Create an instance of SumCalculator
        SumCalculator calc = new SumCalculator();

        // Call the overloaded sum() methods and print the results
        System.out.println("Sum of two integers (2, 3): " + calc.sum(2, 3));
        System.out.println("Sum of multiple integers (1, 2, 3, 4): " + calc.sum(1, 2, 3, 4));
    }
}

class SumCalculator {
    // Method to sum two integers
    public int sum(int a, int b) {
        return a + b;
    }

    // Method to sum a variable number of integers using varargs
    public int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
}