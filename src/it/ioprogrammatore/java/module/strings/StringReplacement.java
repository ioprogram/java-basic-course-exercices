package it.ioprogrammatore.java.module.strings;

/*
Objective: Understand how to replace parts of a string using replace() and replaceAll().
Problem: Write a Java program that declares a String variable and replaces all occurrences of a character and a substring using the replace(char oldChar, char newChar) and replaceAll(String regex, String replacement) methods. Print the modified strings.
 */

public class StringReplacement {
    public static void main(String[] args) {
        String str = "Hello, Java! Java is fun.";

        // Replace all occurrences of 'a' with 'o'
        String replacedStr1 = str.replace('a', 'o');
        System.out.println("Replaced 'a' with 'o': " + replacedStr1);

        // Replace all occurrences of "Java" with "Python"
        String replacedStr2 = str.replaceAll("Java", "Python");
        System.out.println("Replaced 'Java' with 'Python': " + replacedStr2);
    }
}
