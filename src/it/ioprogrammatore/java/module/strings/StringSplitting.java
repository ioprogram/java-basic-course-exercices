package it.ioprogrammatore.java.module.strings;

/*
Objective: Learn how to split a string into an array of substrings using split().
Problem: Write a Java program that declares a String variable containing a sentence, splits it into an array of words using a space character as the delimiter, and prints each word in the array.
 */

public class StringSplitting {
    public static void main(String[] args) {
        String sentence = "Java is a versatile programming language.";

        // Split the string into an array of words
        String[] words = sentence.split(" ");

        // Print each word
        for (String word : words) {
            System.out.println(word);
        }
    }
}
