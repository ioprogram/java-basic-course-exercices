package it.ioprogrammatore.java.module.function;

import java.util.function.BiFunction;

public class BiFunctionExample {

    public static void main(String[] args) {
        // Using BiFunction to add two integers
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        // Apply the BiFunction to different pairs of integers
        int result1 = add.apply(5, 3);
        int result2 = add.apply(10, 20);

        System.out.println("Result of adding 5 and 3: " + result1);
        System.out.println("Result of adding 10 and 20: " + result2);
    }
}


