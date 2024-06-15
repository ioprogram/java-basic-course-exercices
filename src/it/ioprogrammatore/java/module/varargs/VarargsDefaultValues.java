package it.ioprogrammatore.java.module.varargs;

/*
Objective: Implement varargs method with default values.
Problem: Write a Java program that demonstrates a varargs method with default values for parameters. Create a class VarargsDefaultValues with a method greet() that takes a variable number of string arguments. If no arguments are provided, the method should print "Hello, World!". If arguments are provided, it should print "Hello, [name1], [name2], ...".
 */

public class VarargsDefaultValues {
    public static void main(String[] args) {
        // Create an instance of VarargsDefaultValues
        VarargsDefaultValuesUtils example = new VarargsDefaultValuesUtils();

        // Call the greet() method with and without arguments
        example.greet();
        example.greet("Alice", "Bob");

        // Output:
        // Hello, World!
        // Hello, Alice, Bob
    }
}

class VarargsDefaultValuesUtils {
    // Method using varargs with default values
    public void greet(String... names) {
        if (names.length == 0) {
            System.out.println("Hello, World!");
        } else {
            System.out.print("Hello, ");
            for (int i = 0; i < names.length; i++) {
                System.out.print(names[i]);
                if (i < names.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
