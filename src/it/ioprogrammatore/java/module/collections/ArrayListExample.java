package it.ioprogrammatore.java.module.collections;

import java.util.ArrayList;

/*
Objective: Understand how to use ArrayList for dynamic arrays.
Problem: Write a Java program that creates an ArrayList of strings, adds elements to the list, removes an element, and iterates through the list to print each element.
 */

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Remove an element from the list
        list.remove("Banana");

        // Iterate through the list and print each element
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}