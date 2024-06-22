package it.ioprogrammatore.java.module.streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java", "streams");

        // Create a stream, convert each string to uppercase, and collect the result into a new list
        List<String> upperCaseWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Print the result
        System.out.println("Uppercase words: " + upperCaseWords);
    }
}

