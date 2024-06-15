package it.ioprogrammatore.java.module.strings;

/*
Objective: Familiarize with basic String methods.
Problem: Write a Java program that declares a String variable, and then uses the following methods: length(), toUpperCase(), toLowerCase(), and trim(). Print the results of each operation.
 */

public class BasicStringMethods {
    public static void main(String[] args) {
        String str = "  Hello, Java!  ";

        // Get length of the string
        int length = str.length();
        System.out.println("Length: " + length);

        // Convert to upper case
        String upperStr = str.toUpperCase();
        System.out.println("Upper Case: " + upperStr);

        // Convert to lower case
        String lowerStr = str.toLowerCase();
        System.out.println("Lower Case: " + lowerStr);

        // Trim whitespace
        String trimmedStr = str.trim();
        System.out.println("Trimmed: " + trimmedStr);
    }
}
