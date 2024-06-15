package it.ioprogrammatore.java.module.collections;

import java.util.HashMap;
import java.util.Map;

/*
Objective: Understand how to use HashMap for key-value pairs.
Problem: Write a Java program that creates a HashMap to store student names and their corresponding grades. Add entries to the map, retrieve a grade for a specific student, and iterate through the map to print each key-value pair.
 */

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap to store student names and grades
        HashMap<String, Integer> map = new HashMap<>();

        // Add entries to the map
        map.put("Alice", 90);
        map.put("Bob", 85);
        map.put("Charlie", 92);

        // Retrieve a grade for a specific student
        int grade = map.get("Bob");
        System.out.println("Bob's grade: " + grade);

        // Iterate through the map and print each key-value pair
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}