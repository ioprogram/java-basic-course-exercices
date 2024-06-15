package it.ioprogrammatore.java.module.records;

/*
Objective: Add validation logic to a Record's constructor.
Problem: Write a Java program that declares a Person record with validation logic to ensure the age is non-negative. If a negative age is provided, throw an IllegalArgumentException.
 */

public class RecordWithValidation {
    public static void main(String[] args) {
        // Declare the Person record with validation logic
        record Person(String name, int age) {
            // Compact constructor with validation
            public Person {
                if (age < 0) {
                    throw new IllegalArgumentException("Age cannot be negative");
                }
            }
        }

        try {
            // Create an instance of the Person record with a valid age
            Person person1 = new Person("Dave", 35);
            System.out.println("Person 1: " + person1);

            // Attempt to create an instance of the Person record with a negative age
            Person person2 = new Person("Eve", -5);
            System.out.println("Person 2: " + person2);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
