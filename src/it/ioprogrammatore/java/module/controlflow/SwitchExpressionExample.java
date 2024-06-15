package it.ioprogrammatore.java.module.controlflow;

/*
Objective: Use the new switch expression with yield introduced in Java 12 and enhanced in Java 17.
Problem: Write a Java program that calculates the number of days in a given month using a switch expression with yield
 */

public class SwitchExpressionExample {
    public static void main(String[] args) {
        String month = "February";
        int year = 2024; // Leap year

        int days = switch (month) {
            case "January", "March", "May", "July", "August", "October", "December" -> 31;
            case "April", "June", "September", "November" -> 30;
            case "February" -> {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    yield 29;
                } else {
                    yield 28;
                }
            }
            default -> throw new IllegalArgumentException("Invalid month: " + month);
        };

        System.out.println("Number of days in " + month + " " + year + ": " + days);
    }
}
