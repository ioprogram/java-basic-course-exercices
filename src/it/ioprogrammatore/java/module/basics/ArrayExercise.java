package it.ioprogrammatore.java.module.basics;

/*
Objective: Understand the use of arrays.
Problem: Write a Java program that initializes an array of integers, calculates the sum of its elements, and finds the maximum value in the array.
 */

public class ArrayExercise {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8};
        int sum = 0;
        int max = numbers[0];

        // Calculate the sum and find the maximum value
        for (int num : numbers) {
            sum += num;
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
    }
}
