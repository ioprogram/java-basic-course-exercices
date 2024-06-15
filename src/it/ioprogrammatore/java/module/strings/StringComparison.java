package it.ioprogrammatore.java.module.strings;

/*
Objective: Understand how to compare strings using equals(), equalsIgnoreCase(), and compareTo().
Problem: Write a Java program that declares two String variables and compares them using the aforementioned methods. Print the results of each comparison.
 */

public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        // Compare using equals()
        boolean isEqual = str1.equals(str2);
        System.out.println("Equals: " + isEqual);

        // Compare using equalsIgnoreCase()
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println("Equals Ignore Case: " + isEqualIgnoreCase);

        // Compare using compareTo()
        int comparisonResult = str1.compareTo(str2);
        System.out.println("Compare To: " + comparisonResult);
    }
}
