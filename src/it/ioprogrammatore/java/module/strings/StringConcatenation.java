package it.ioprogrammatore.java.module.strings;

/*
Objective: Learn various ways to concatenate strings.
Problem: Write a Java program that declares three String variables and concatenates them using the + operator and the concat() method. Print the concatenated strings.
 */

public class StringConcatenation {
    public static void main(String[] args) {
        String part1 = "Hello";
        String part2 = " ";
        String part3 = "Java";

        // Concatenate using + operator
        String concatenatedStr1 = part1 + part2 + part3;
        System.out.println("Concatenated using + operator: " + concatenatedStr1);

        // Concatenate using concat() method
        String concatenatedStr2 = part1.concat(part2).concat(part3);
        System.out.println("Concatenated using concat() method: " + concatenatedStr2);
    }
}
