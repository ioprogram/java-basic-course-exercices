package it.ioprogrammatore.java.module.function;

import java.util.function.Supplier;
import java.util.Random;

public class SupplierExample {

    public static void main(String[] args) {
        Random random = new Random();

        // Using Supplier to generate a random number
        Supplier<Integer> randomNumberSupplier = () -> random.nextInt(100);

        // Generate and print random numbers
        System.out.println("Random number 1: " + randomNumberSupplier.get());
        System.out.println("Random number 2: " + randomNumberSupplier.get());
        System.out.println("Random number 3: " + randomNumberSupplier.get());
    }
}


