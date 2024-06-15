package it.ioprogrammatore.java.module.collections;

import java.util.LinkedHashMap;
import java.util.Map;

/*
Objective: Understand how to use LinkedHashMap for maintaining insertion order.
Problem: Write a Java program that creates a LinkedHashMap to store student names and their corresponding grades. Add entries to the map, retrieve a grade for a specific student, and iterate through the map to print each key-value pair in insertion order.
 */

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Create a LinkedHashMap to store student names and grades
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        // Add entries to the map
        map.put("Alice", 90);
        map.put("Bob", 85);
        map.put("Charlie", 92);

        // Retrieve a grade for a specific student
        int grade = map.get("Bob");
        System.out.println("Bob's grade: " + grade);

        // Iterate through the map and print each key-value pair in insertion order
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
