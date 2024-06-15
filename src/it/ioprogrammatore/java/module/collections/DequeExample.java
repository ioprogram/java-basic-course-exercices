package it.ioprogrammatore.java.module.collections;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Objective: Understand how to use Deque for double-ended queue operations.
Problem: Write a Java program that creates a Deque of strings using ArrayDeque, adds elements to both ends, removes elements from both ends, and iterates through the deque to print each element.
 */

public class DequeExample {
    public static void main(String[] args) {
        // Create a Deque of strings
        Deque<String> deque = new ArrayDeque<>();

        // Add elements to both ends
        deque.addFirst("Apple");
        deque.addLast("Banana");
        deque.addFirst("Cherry");

        // Remove elements from both ends
        System.out.println("Removed from first: " + deque.removeFirst());
        System.out.println("Removed from last: " + deque.removeLast());

        // Iterate through the deque and print each element
        for (String fruit : deque) {
            System.out.println(fruit);
        }
    }
}