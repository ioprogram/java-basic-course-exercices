package it.ioprogrammatore.java.module.arrays;


/*
Objective: Understand how to declare and work with ragged (or jagged) arrays.
Problem: Write a Java program that declares a ragged array (a 2D array with rows of different lengths), initializes it with values, and prints the array.
 */

public class RaggedArray {
    public static void main(String[] args) {
        // Declare and initialize a ragged array
        int[][] ragged = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        // Access and print each element in the ragged array
        for (int i = 0; i < ragged.length; i++) {
            for (int j = 0; j < ragged[i].length; j++) {
                System.out.print(ragged[i][j] + " ");
            }
            System.out.println();
        }
    }
}
