package it.ioprogrammatore.java.module.localdate;

import java.time.LocalDate;
import java.time.DayOfWeek;

/*
Objective: Determine the day of the week for a given date.
Problem: Write a Java program that creates a LocalDate object for a specific date (e.g., January 1, 2000) and prints the day of the week for that date.
 */

public class DayOfWeekExample {
    public static void main(String[] args) {
        // Specific date
        LocalDate date = LocalDate.of(2000, 1, 1);

        // Get the day of the week
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("January 1, 2000 was a " + dayOfWeek);
    }
}
