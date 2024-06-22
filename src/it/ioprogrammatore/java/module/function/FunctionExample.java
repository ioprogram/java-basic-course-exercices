package it.ioprogrammatore.java.module.function;


import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        // Using Function to convert a string to uppercase
        Function<String, String> toUpperCase = str -> str.toUpperCase();

        // Apply the Function to different strings
        String str1 = "hello";
        String str2 = "world";

        System.out.println("Uppercase of str1: " + toUpperCase.apply(str1));
        System.out.println("Uppercase of str2: " + toUpperCase.apply(str2));
    }
}

