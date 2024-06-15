package it.ioprogrammatore.java.module.collections;

import java.util.LinkedHashSet;

/*
Objective: Understand how to use LinkedHashSet for maintaining insertion order with unique elements.
Problem: Write a Java program that creates a LinkedHashSet of strings, adds elements to the set, and iterates through the set to print each element in insertion order.
 */

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet of strings
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Add elements to the set
        set.add("Element1");
        set.add("Element2");
        set.add("Element3");

        // Iterate through the set and print each element in insertion order
        for (String element : set) {
            System.out.println(element);
        }
    }
}
