package it.ioprogrammatore.java.module.collections;

import java.util.Stack;

/*
Objective: Understand how to use Stack for LIFO (Last In, First Out) operations.
Problem: Write a Java program that creates a Stack of integers, pushes elements onto the stack, pops elements from the stack, and prints each popped element.
 */

public class StackExample {
    public static void main(String[] args) {
        // Create a Stack of integers
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Pop elements from the stack and print each popped element
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
