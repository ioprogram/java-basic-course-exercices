package it.ioprogrammatore.java.module.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Objective: Understand how to use utility methods provided by the Collections class.
Problem: Write a Java program that creates a list of integers, shuffles the list, finds the minimum and maximum elements, and sorts the list using utility methods from the Collections class.
 */

public class CollectionsUtilityMethods {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);

        // Shuffle the list
        Collections.shuffle(numbers);
        System.out.println("Shuffled list: " + numbers);

        // Find the minimum and maximum elements
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);

        // Sort the list
        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);
    }
}
