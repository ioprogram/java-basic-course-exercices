package it.ioprogrammatore.java.module.strings;

/*
Objective: Understand how to use StringBuilder for efficient string manipulation.
Problem: Write a Java program that uses StringBuilder to construct a string by appending various parts and then converting it back to a String. Print the final string.
 */

public class StringBuilderUsage {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        // Append parts to the StringBuilder
        sb.append("Java");
        sb.append(" ");
        sb.append("is");
        sb.append(" ");
        sb.append("awesome!");

        // Convert StringBuilder to String
        String finalString = sb.toString();
        System.out.println("Final String: " + finalString);
    }
}
