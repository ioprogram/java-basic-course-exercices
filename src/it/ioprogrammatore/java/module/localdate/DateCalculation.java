package it.ioprogrammatore.java.module.localdate;

import java.time.LocalDate;

/*
Objective: Perform calculations on dates using LocalDate.
Problem: Write a Java program that calculates the date 100 days from today and the date 100 days ago. Print both dates.
 */

public class DateCalculation {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        // Calculate the date 100 days from today
        LocalDate futureDate = today.plusDays(100);
        System.out.println("Date 100 days from today: " + futureDate);

        // Calculate the date 100 days ago
        LocalDate pastDate = today.minusDays(100);
        System.out.println("Date 100 days ago: " + pastDate);
    }
}
