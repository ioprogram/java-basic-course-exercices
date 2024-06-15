package it.ioprogrammatore.java.module.basics;

/*
Objective: Understand how to use boolean variables and logical operators.
Problem: Write a Java program that declares boolean variables and uses logical operators (&&, ||, !) to evaluate expressions. Print the results of these expressions.
 */

public class BooleanLogic {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Logical AND
        System.out.println("a && b: " + (a && b));

        // Logical OR
        System.out.println("a || b: " + (a || b));

        // Logical NOT
        System.out.println("!a: " + (!a));
        System.out.println("!b: " + (!b));
    }
}
