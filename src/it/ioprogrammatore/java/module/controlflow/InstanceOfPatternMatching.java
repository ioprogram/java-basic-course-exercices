package it.ioprogrammatore.java.module.controlflow;

/*
Objective: Understand and use pattern matching for instanceof introduced in Java 16.
Problem: Write a Java program that uses pattern matching for instanceof to check the type of an object and print its details accordingly.
 */

public class InstanceOfPatternMatching {
    public static void main(String[] args) {
        Object obj = "Hello, Java 17!";

        if (obj instanceof String str) {
            System.out.println("The object is a string with value: " + str);
        } else {
            System.out.println("The object is not a string.");
        }
    }
}
