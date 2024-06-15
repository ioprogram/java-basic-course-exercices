package it.ioprogrammatore.java.module.controlflow;

/*
Objective: Understand and use do-while loops.
Problem: Write a Java program that prints the numbers from 1 to 5 using a do-while loop.
 */

public class DoWhileLoopExample {
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }
}
