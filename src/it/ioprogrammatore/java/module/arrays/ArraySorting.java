package it.ioprogrammatore.java.module.arrays;

import java.util.Arrays;

/*
Objective: Learn how to sort arrays using the Arrays.sort() method.
Problem: Write a Java program that declares an array of integers, sorts it in ascending order using Arrays.sort(), and prints the sorted array.
 */

public class ArraySorting {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Print the sorted array
        System.out.println("Sorted array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
