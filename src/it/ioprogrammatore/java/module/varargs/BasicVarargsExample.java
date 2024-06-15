package it.ioprogrammatore.java.module.varargs;

/*
Exercise 1: Basic Varargs Method
Objective: Understand the basic usage of varargs.
Problem: Write a Java program that demonstrates a method using varargs. Create a class VarargsExample with a method printNumbers() that takes a variable number of integer arguments and prints each number.
 */

public class BasicVarargsExample {
    public static void main(String[] args) {
        // Create an instance of VarargsExample
        VarargsExample example = new VarargsExample();

        // Call the printNumbers() method with different numbers of arguments
        example.printNumbers(1, 2, 3);
        example.printNumbers(4, 5);
        example.printNumbers(6, 7, 8, 9, 10);
    }
}

class VarargsExample {
    // Method using varargs to print numbers
    public void printNumbers(int... numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
