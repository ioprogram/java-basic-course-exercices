package it.ioprogrammatore.java.module.records;

/*
Objective: Understand how to use nested Records.
Problem: Write a Java program that declares a Address record with fields for street (String) and city (String). Then declare a Person record that includes an Address field. Create an instance of the Person record with an address and print all fields.
 */

public class NestedRecords {
    public static void main(String[] args) {
        // Declare the Address record
        record Address(String street, String city) {}

        // Declare the Person record with an Address field
        record Person(String name, int age, Address address) {}

        // Create an instance of the Address record
        Address address = new Address("123 Main St", "Anytown");

        // Create an instance of the Person record
        Person person = new Person("Charlie", 40, address);

        // Print the fields of the Person record, including the Address fields
        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());
        System.out.println("Street: " + person.address().street());
        System.out.println("City: " + person.address().city());
    }
}
