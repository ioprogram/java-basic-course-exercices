package it.ioprogrammatore.java.module.controlflow;

/*
Objective: Use the switch statement, including the new switch expressions introduced in Java 12 and enhanced in Java 17.
Problem: Write a Java program that takes a day of the week and prints whether it is a weekday or weekend using a switch statement.
 */

public class SwitchExample {
    public static void main(String[] args) {
        String day = "Saturday";

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println(day + " is a weekday.");
            case "Saturday", "Sunday" -> System.out.println(day + " is a weekend.");
            default -> System.out.println("Invalid day.");
        }
    }
}
