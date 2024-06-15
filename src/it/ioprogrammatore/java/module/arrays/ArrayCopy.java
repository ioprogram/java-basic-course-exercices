package it.ioprogrammatore.java.module.arrays;

/*
Objective: Learn how to copy elements from one array to another.
Problem: Write a Java program that copies elements from one array to another using both manual copying and the System.arraycopy() method. Print both arrays to confirm the copy.
 */

public class ArrayCopy {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};

        // Manual copying
        int[] copy1 = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy1[i] = original[i];
        }

        // Using System.arraycopy()
        int[] copy2 = new int[original.length];
        System.arraycopy(original, 0, copy2, 0, original.length);

        // Print original and copied arrays
        System.out.println("Original array: ");
        for (int num : original) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Copied array (manual): ");
        for (int num : copy1) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Copied array (System.arraycopy): ");
        for (int num : copy2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
