package it.ioprogrammatore.java.module.collections;

import java.util.PriorityQueue;

/*
Objective: Understand how to use PriorityQueue for priority-based ordering.
Problem: Write a Java program that creates a PriorityQueue of integers, adds elements to the queue, and iterates through the queue to print each element in natural order (priority order).
 */

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue of integers
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // Add elements to the queue
        queue.add(5);
        queue.add(1);
        queue.add(3);
        queue.add(2);
        queue.add(4);

        // Poll elements from the queue and print each element
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
