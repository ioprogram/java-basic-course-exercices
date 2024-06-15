package it.ioprogrammatore.java.module.collections;

import java.util.LinkedList;
import java.util.Queue;

/*
Objective: Understand how to use Queue for FIFO (First In, First Out) operations.
Problem: Write a Java program that creates a Queue of strings using LinkedList, adds elements to the queue, removes elements from the queue, and prints each removed element.
 */

public class QueueExample {
    public static void main(String[] args) {
        // Create a Queue of strings
        Queue<String> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        // Remove elements from the queue and print each removed element
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
