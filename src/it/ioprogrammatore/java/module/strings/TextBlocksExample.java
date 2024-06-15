package it.ioprogrammatore.java.module.strings;

/*
Objective: Understand how to use text blocks for multi-line strings.
Problem: Write a Java program that utilizes text blocks to store a multi-line string representing a JSON object. Print the JSON object to the console.
 */

public class TextBlocksExample {
    public static void main(String[] args) {
        // Declare a String variable using a text block to represent a JSON object
        String jsonObject = """
        {
            "name": "John Doe",
            "age": 30,
            "email": "johndoe@example.com",
            "address": {
                "street": "123 Main St",
                "city": "Anytown",
                "zipcode": "12345"
            }
        }
        """;

        // Print the JSON object
        System.out.println(jsonObject);
    }
}
