package it.ioprogrammatore.java.module.strings;

/*
Objective: Learn how to extract substrings and characters from a String.
Problem: Write a Java program that declares a String variable, and then uses the substring(int beginIndex, int endIndex) and charAt(int index) methods to extract and print parts of the string and individual characters.
 */

public class SubstringAndCharExtraction {
    public static void main(String[] args) {
        String str = "Hello, Java!";

        // Extract substring from index 7 to 11
        String substring = str.substring(7, 11);
        System.out.println("Substring: " + substring);

        // Extract character at index 1
        char charAt = str.charAt(1);
        System.out.println("Character at index 1: " + charAt);
    }
}