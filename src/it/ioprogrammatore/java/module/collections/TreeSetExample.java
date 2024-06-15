package it.ioprogrammatore.java.module.collections;

import java.util.TreeSet;

/*
Objective: Understand how to use TreeSet for sorted unique elements.
Problem: Write a Java program that creates a TreeSet of integers, adds elements to the set, and iterates through the set to print each element in ascending order.
 */

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet of integers
        TreeSet<Integer> set = new TreeSet<>();

        // Add elements to the set
        set.add(5);
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(4);

        // Iterate through the set and print each element in ascending order
        for (Integer number : set) {
            System.out.println(number);
        }
    }
}
