package it.ioprogrammatore.java.module.basics;

/*
Objective: Understand how to manipulate strings.
Problem: Write a Java program that declares a String variable, performs various string operations (concatenation, length, substring, and character extraction), and prints the results.
 */

public class StringOperations {
    public static void main(String[] args) {
        String str = "Hello, Java!";

        // Concatenation
        String concatenatedStr = str + " How are you?";
        System.out.println("Concatenated String: " + concatenatedStr);

        // Length
        int length = str.length();
        System.out.println("Length of String: " + length);

        // Substring
        String substring = str.substring(7, 11);
        System.out.println("Substring: " + substring);

        // Character extraction
        char charAt = str.charAt(0);
        System.out.println("Character at index 0: " + charAt);
    }
}
