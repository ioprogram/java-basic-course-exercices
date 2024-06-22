package it.ioprogrammatore.java.module.function;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        // Using Predicate to check if a string is non-empty
        Predicate<String> isNonEmpty = str -> str != null && !str.isEmpty();

        // Test the Predicate with different strings
        String str1 = "Hello, World!";
        String str2 = "";
        String str3 = null;

        System.out.println("Is str1 non-empty? " + isNonEmpty.test(str1));
        System.out.println("Is str2 non-empty? " + isNonEmpty.test(str2));
        System.out.println("Is str3 non-empty? " + isNonEmpty.test(str3));
    }
}

