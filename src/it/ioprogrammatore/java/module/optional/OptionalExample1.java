package it.ioprogrammatore.java.module.optional;

import java.util.Optional;

public class OptionalExample1 {

    public static void main(String[] args) {
        // Creating Optional objects
        Optional<String> nonEmptyOptional = Optional.of("Hello, Optional!");
        Optional<String> emptyOptional = Optional.ofNullable(null);

        // Check if nonEmptyOptional contains a value
        if (nonEmptyOptional.isPresent()) {
            System.out.println("nonEmptyOptional contains: " + nonEmptyOptional.get());
        } else {
            System.out.println("nonEmptyOptional is empty");
        }

        // Check if emptyOptional contains a value
        if (emptyOptional.isPresent()) {
            System.out.println("emptyOptional contains: " + emptyOptional.get());
        } else {
            System.out.println("emptyOptional is empty");
        }

        // Using ifPresent to print the value if present
        nonEmptyOptional.ifPresent(value -> System.out.println("Value in nonEmptyOptional: " + value));
    }
}
