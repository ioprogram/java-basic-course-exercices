package it.ioprogrammatore.java.module.optional;


import java.util.Optional;

public class OptionalExample3 {

    public static void main(String[] args) {
        // Creating Optional objects
        Optional<String> nonEmptyOptional = Optional.of("Hello, Optional!");
        Optional<String> emptyOptional = Optional.ofNullable(null);

        // Using filter to conditionally process the value
        Optional<String> filteredNonEmptyOptional = nonEmptyOptional.filter(value -> value.contains("Hello"));
        Optional<String> filteredEmptyOptional = emptyOptional.filter(value -> value != null);

        // Print the filtered values
        filteredNonEmptyOptional.ifPresent(value -> System.out.println("Filtered nonEmptyOptional: " + value));
        filteredEmptyOptional.ifPresent(value -> System.out.println("Filtered emptyOptional: " + value));
    }
}

