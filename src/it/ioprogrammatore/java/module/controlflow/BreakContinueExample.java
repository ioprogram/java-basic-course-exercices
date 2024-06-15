package it.ioprogrammatore.java.module.controlflow;

/*
Objective: Understand how to use break and continue statements within loops.
Problem: Write a Java program that prints numbers from 1 to 10. Use the continue statement to skip numbers divisible by 3 and the break statement to stop the loop when the number is greater than 8.
 */

public class BreakContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i > 8) {
                break;
            }
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
