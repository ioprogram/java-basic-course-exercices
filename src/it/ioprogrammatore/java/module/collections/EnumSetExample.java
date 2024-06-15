package it.ioprogrammatore.java.module.collections;

import java.util.EnumSet;

/*
Objective: Understand how to use EnumSet for sets of enum types.
Problem: Write a Java program that creates an EnumSet of days of the week, adds elements to the set, and iterates through the set to print each day.
 */

public class EnumSetExample {
    // Enum for days of the week
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        // Create an EnumSet of days of the week
        EnumSet<Day> days = EnumSet.of(Day.MONDAY, Day.WEDNESDAY, Day.FRIDAY);

        // Add elements to the set
        days.add(Day.SUNDAY);

        // Iterate through the set and print each day
        for (Day day : days) {
            System.out.println(day);
        }
    }
}