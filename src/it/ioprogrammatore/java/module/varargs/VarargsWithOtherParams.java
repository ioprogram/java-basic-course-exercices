package it.ioprogrammatore.java.module.varargs;

/*
Objective: Understand how to use varargs with other parameters.
Problem: Write a Java program that demonstrates a method using varargs along with other parameters. Create a class VarargsWithOtherParams with a method concatenate() that takes a string delimiter and a variable number of string arguments. The method should concatenate the strings using the delimiter and return the result.
 */

public class VarargsWithOtherParams {
    public static void main(String[] args) {
        // Create an instance of VarargsWithOtherParams
        VarargsWithOtherParamsUtils example = new VarargsWithOtherParamsUtils();

        // Call the concatenate() method with different numbers of arguments
        String result1 = example.concatenate("-", "A", "B", "C");
        String result2 = example.concatenate(", ", "Java", "is", "fun");

        // Print the results
        System.out.println(result1); // Output: A-B-C
        System.out.println(result2); // Output: Java, is, fun
    }
}

class VarargsWithOtherParamsUtils {
    // Method using varargs to concatenate strings with a delimiter
    public String concatenate(String delimiter, String... strings) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            result.append(strings[i]);
            if (i < strings.length - 1) {
                result.append(delimiter);
            }
        }
        return result.toString();
    }
}
