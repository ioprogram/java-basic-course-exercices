package it.ioprogrammatore.java.module.controlflow;

/*
Objective: Understand and use if-else statements.
Problem: Write a Java program that checks if a number is positive, negative, or zero and prints the appropriate message.
 */

public class IfElseExample {
    public static void main(String[] args) {
        int number = -5;

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
