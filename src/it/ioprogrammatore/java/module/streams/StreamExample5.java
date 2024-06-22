package it.ioprogrammatore.java.module.streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample5 {

    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        // Create a stream, flatten the structure to a single list, and collect the result into a new list
        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        // Print the result
        System.out.println("Flattened list: " + flattenedList);
    }
}
