package it.ioprogrammatore.java.module.localdate;

import java.time.LocalDate;

/*
Objective: Understand how to create and manipulate LocalDate objects.
Problem: Write a Java program that creates a LocalDate object representing the current date and another LocalDate object representing a specific date (e.g., your birthday). Print both dates.
 */

public class BasicLocalDate {
    public static void main(String[] args) {
        // Current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        // Specific date (e.g., birthday)
        LocalDate birthday = LocalDate.of(1990, 5, 15);
        System.out.println("Birthday: " + birthday);
    }
}