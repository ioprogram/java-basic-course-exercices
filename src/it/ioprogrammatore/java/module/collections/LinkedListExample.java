package it.ioprogrammatore.java.module.collections;

import java.util.LinkedList;

/*
Objective: Understand how to use LinkedList for dynamic lists.
Problem: Write a Java program that creates a LinkedList of strings, adds elements to the list at both ends, removes the first and last elements, and iterates through the list to print each element.
 */

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of strings
        LinkedList<String> list = new LinkedList<>();

        // Add elements to the list at both ends
        list.addFirst("Apple");
        list.addLast("Banana");
        list.addFirst("Cherry");

        // Remove the first and last elements
        list.removeFirst();
        list.removeLast();

        // Iterate through the list and print each element
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
