package it.ioprogrammatore.java.module.function;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;

public class CombinedFunctionalInterfacesExample {

    public static void main(String[] args) {
        // Using Predicate to check if a string starts with 'A'
        Predicate<String> startsWithA = str -> str.startsWith("A");

        // Using Function to convert a string to uppercase
        Function<String, String> toUpperCase = str -> str.toUpperCase();

        // Using Consumer to print a string
        Consumer<String> printString = str -> System.out.println(str);

        // List of strings
        List<String> strings = Arrays.asList("Alice", "Bob", "Adam", "Eve");

        // Combine Predicate, Function, and Consumer to filter, transform, and print the list of strings
        strings.stream()
                .filter(startsWithA)
                .map(toUpperCase)
                .forEach(printString);
    }
}

