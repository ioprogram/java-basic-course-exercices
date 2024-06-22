package it.ioprogrammatore.java.module.optional;


import java.util.Optional;

public class OptionalExample2 {

    public static void main(String[] args) {
        // Creating Optional objects
        Optional<String> nonEmptyOptional = Optional.of("Hello, Optional!");
        Optional<String> emptyOptional = Optional.ofNullable(null);

        // Using orElse to provide a default value
        String value1 = nonEmptyOptional.orElse("Default Value");
        String value2 = emptyOptional.orElse("Default Value");

        System.out.println("Value from nonEmptyOptional: " + value1);
        System.out.println("Value from emptyOptional: " + value2);

        // Using orElseGet to provide a default value
        String value3 = nonEmptyOptional.orElseGet(() -> "Default Value from Supplier");
        String value4 = emptyOptional.orElseGet(() -> "Default Value from Supplier");

        System.out.println("Value from nonEmptyOptional using orElseGet: " + value3);
        System.out.println("Value from emptyOptional using orElseGet: " + value4);
    }
}
