package it.ioprogrammatore.java.module.records;

/*
Objective: Understand how to declare and use a basic Record.
Problem: Write a Java program that declares a Person record with fields for name (String) and age (int). Create an instance of the Person record and print its fields.
 */

public class BasicRecordExample {
    public static void main(String[] args) {
        // Declare the Person record
        record Person(String name, int age) {}

        // Create an instance of the Person record
        Person person = new Person("Alice", 30);

        // Print the fields of the Person record
        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());
    }
}
