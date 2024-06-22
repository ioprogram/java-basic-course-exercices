package it.ioprogrammatore.java.module.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample3 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 9, 2);

        // Create a stream, sort the integers in ascending order, and collect the result into a new list
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        // Print the result
        System.out.println("Sorted numbers: " + sortedNumbers);
    }
}

