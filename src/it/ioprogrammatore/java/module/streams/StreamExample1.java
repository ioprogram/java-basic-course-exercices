package it.ioprogrammatore.java.module.streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Create a stream, filter out even numbers, and collect the result into a new list
        List<Integer> oddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());

        // Print the result
        System.out.println("Odd numbers: " + oddNumbers);
    }
}
