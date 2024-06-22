package it.ioprogrammatore.java.module.lamda;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample3 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");

        // Using lambda expression to filter names that start with 'A'
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .toList();

        // Old manner
//        List<String> filteredNames = names.stream()
//                .filter(name -> name.startsWith("A"))
//                .collect(Collectors.toList());


        // Print the filtered names
        filteredNames.forEach(System.out::println);
    }
}
