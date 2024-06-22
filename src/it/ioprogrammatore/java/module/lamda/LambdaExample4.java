package it.ioprogrammatore.java.module.lamda;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExample4 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(8);
        numbers.add(3);
        numbers.add(7);

        // Using lambda expression with Comparator to sort in descending order
        Comparator<Integer> descendingOrder = (a, b) -> b - a;
        numbers.sort(descendingOrder);

        // Print the sorted list
        numbers.forEach(System.out::println);
    }
}
