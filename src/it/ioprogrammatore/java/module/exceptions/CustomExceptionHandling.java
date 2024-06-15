package it.ioprogrammatore.java.module.exceptions;

/*
Objective: Understand how to create, throw, and handle custom exceptions.
Problem: Write a Java program that defines a custom exception InvalidAgeException. Create a method that checks if a person's age is valid (age must be between 0 and 120). If the age is invalid, throw the InvalidAgeException. Handle this exception in the main method and print an appropriate message.
 */

public class CustomExceptionHandling {
    public static void main(String[] args) {
        try {
            checkAge(150);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method to check age
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Error: Invalid age " + age + ". Age must be between 0 and 120.");
        } else {
            System.out.println("Age is valid: " + age);
        }
    }
}

// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
