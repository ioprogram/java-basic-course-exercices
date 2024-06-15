package it.ioprogrammatore.java.module.localdate;

import java.time.LocalDate;

/*
Objective: Compare two LocalDate objects.
Problem: Write a Java program that compares two LocalDate objects (e.g., your birthday and today's date) and prints whether the first date is before, after, or equal to the second date.
 */

public class DateComparison {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1990, 5, 15);

        // Compare the dates
        if (birthday.isBefore(today)) {
            System.out.println("Birthday is before today.");
        } else if (birthday.isAfter(today)) {
            System.out.println("Birthday is after today.");
        } else {
            System.out.println("Birthday is today!");
        }
    }
}
