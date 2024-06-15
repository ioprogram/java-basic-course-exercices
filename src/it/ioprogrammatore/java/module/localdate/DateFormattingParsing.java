package it.ioprogrammatore.java.module.localdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/*
Objective: Format and parse LocalDate objects using DateTimeFormatter.
Problem: Write a Java program that formats a LocalDate object into a string using different patterns and parses a string into a LocalDate object.
 */

public class DateFormattingParsing {
    public static void main(String[] args) {
        // Current date
        LocalDate today = LocalDate.now();

        // Format the date using different patterns
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Formatted Date (dd/MM/yyyy): " + today.format(formatter1));

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        System.out.println("Formatted Date (MMMM dd, yyyy): " + today.format(formatter2));

        // Parse a string into a LocalDate
        String dateString = "15-05-1990";
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate parsedDate = LocalDate.parse(dateString, formatter3);
        System.out.println("Parsed Date: " + parsedDate);
    }
}
