package it.ioprogrammatore.java.module.localdate;

import java.time.LocalDate;

/*
Objective: Determine if a given year is a leap year.
Problem: Write a Java program that checks if the current year and a specific year (e.g., 2000) are leap years. Print the results.
 */

public class LeapYearCheck {
    public static void main(String[] args) {
        // Current year
        LocalDate today = LocalDate.now();
        int currentYear = today.getYear();

        // Specific year
        int specificYear = 2000;

        // Check if the years are leap years
        boolean isCurrentYearLeap = today.isLeapYear();
        boolean isSpecificYearLeap = LocalDate.of(specificYear, 1, 1).isLeapYear();

        System.out.println("Is " + currentYear + " a leap year? " + isCurrentYearLeap);
        System.out.println("Is " + specificYear + " a leap year? " + isSpecificYearLeap);
    }
}
