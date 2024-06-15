package it.ioprogrammatore.java.module.exceptions;

/*
Objective: Understand how to handle null pointer exceptions.
Problem: Write a Java program that attempts to access a method on a null object reference and handles the NullPointerException that occurs. Print an appropriate message when the exception is caught.
 */

public class NullPointerExceptionHandling {
    public static void main(String[] args) {
        String str = null;

        try {
            int length = str.length();
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.out.println("Error: Attempted to access a method on a null object reference.");
        }
    }
}
