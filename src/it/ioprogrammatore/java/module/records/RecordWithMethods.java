package it.ioprogrammatore.java.module.records;

/*
Objective: Add custom methods to a Record.
Problem: Extend the Person record to include a method that returns a greeting message. Create an instance of the Person record and call the greeting method.
 */

public class RecordWithMethods {
    public static void main(String[] args) {
        // Declare the Person record with an additional method
        record Person(String name, int age) {
            // Method to return a greeting message
            public String greet() {
                return "Hello, my name is " + name + " and I am " + age + " years old.";
            }
        }

        // Create an instance of the Person record
        Person person = new Person("Bob", 25);

        // Call the greet method and print the message
        System.out.println(person.greet());
    }
}
