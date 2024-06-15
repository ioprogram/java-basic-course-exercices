package it.ioprogrammatore.java.module.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/*
Objective: Understand how to use the finally block to execute code regardless of whether an exception is thrown.
Problem: Write a Java program that attempts to open a file, read its contents, and close the file. Use a try-catch-finally block to handle IOException and ensure the file is closed in the finally block.
 */

public class FinallyBlockExample {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("example.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: Unable to read the file.");
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("File closed successfully.");
                }
            } catch (IOException e) {
                System.out.println("Error: Unable to close the file.");
            }
        }
    }
}