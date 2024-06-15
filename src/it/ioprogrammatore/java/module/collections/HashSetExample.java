package it.ioprogrammatore.java.module.collections;

import java.util.HashSet;

/*
Objective: Understand how to use HashSet for unique elements.
Problem: Write a Java program that creates a HashSet of integers, adds elements to the set, checks if a specific element is present, and iterates through the set to print each element.
 */

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet of integers
        HashSet<Integer> set = new HashSet<>();

        // Add elements to the set
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2); // Duplicate element

        // Check if a specific element is present
        boolean containsTwo = set.contains(2);
        System.out.println("Set contains 2: " + containsTwo);

        // Iterate through the set and print each element
        for (Integer number : set) {
            System.out.println(number);
        }
    }
}
