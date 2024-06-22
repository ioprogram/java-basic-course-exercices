package it.ioprogrammatore.java.module.streams;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample6 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java", "streams", "example");

        // Create a stream and use the Collectors.groupingBy method to group the strings by their length
        Map<Integer, List<String>> groupedByLength = words.stream()
                .collect(Collectors.groupingBy(String::length));

        // Print the result
        groupedByLength.forEach((length, wordList) ->
                System.out.println("Length " + length + ": " + wordList));
    }
}
