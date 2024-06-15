package it.ioprogrammatore.java.module.records;

/*
Objective: Override the default toString method in a Record.
Problem: Write a Java program that declares a Person record and overrides the toString method to provide a custom string representation. Create an instance of the Person record and print it.
 */

public class RecordWithCustomToString {
    public static void main(String[] args) {
        // Declare the Person record and override the toString method
        record Person(String name, int age) {
            // Override the toString method
            @Override
            public String toString() {
                return "Person[name=" + name + ", age=" + age + "]";
            }
        }

        // Create an instance of the Person record
        Person person = new Person("Frank", 50);

        // Print the instance to see the custom toString output
        System.out.println(person);
    }
}