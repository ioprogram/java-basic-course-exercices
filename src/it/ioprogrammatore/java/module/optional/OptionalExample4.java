package it.ioprogrammatore.java.module.optional;


import java.util.Optional;

public class OptionalExample4 {

    public static void main(String[] args) {
        // Creating Optional objects
        Optional<String> nonEmptyOptional = Optional.of("Hello, Optional!");

        // Using map to transform the value
        Optional<Integer> lengthOptional = nonEmptyOptional.map(String::length);
        lengthOptional.ifPresent(length -> System.out.println("Length of the string: " + length));

        // Using flatMap to transform the value
        Optional<Optional<Integer>> nestedOptional = nonEmptyOptional.map(value -> Optional.of(value.length()));
        Optional<Integer> flatMappedOptional = nonEmptyOptional.flatMap(value -> Optional.of(value.length()));

        nestedOptional.ifPresent(opt -> opt.ifPresent(length -> System.out.println("Nested Optional length: " + length)));
        flatMappedOptional.ifPresent(length -> System.out.println("FlatMapped Optional length: " + length));
    }
}

