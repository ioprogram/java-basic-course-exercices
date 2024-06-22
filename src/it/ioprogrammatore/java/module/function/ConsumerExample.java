package it.ioprogrammatore.java.module.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        // Using Consumer to print a string
        Consumer<String> printString = str -> System.out.println(str);

        // List of strings
        List<String> strings = Arrays.asList("Alice", "Bob", "Charlie");

        // Apply the Consumer to each element of the list
        strings.forEach(printString);
    }
}

