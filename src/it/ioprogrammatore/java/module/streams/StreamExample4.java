package it.ioprogrammatore.java.module.streams;


import java.util.Arrays;
import java.util.List;

public class StreamExample4 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Create a stream and use the reduce operation to calculate the sum of the integers
        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        // Print the result
        System.out.println("Sum of numbers: " + sum);
    }
}
