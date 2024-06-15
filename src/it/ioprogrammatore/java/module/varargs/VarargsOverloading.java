package it.ioprogrammatore.java.module.varargs;

public class VarargsOverloading {
    public static void main(String[] args) {
        // Create an instance of VarargsOverloading
        VarargsOverloadingUtils example = new VarargsOverloadingUtils();

        // Call the overloaded add() methods and print the results
        int sum1 = example.add(2, 3);
        int sum2 = example.add(1, 2, 3, 4);

        // Print the results
        System.out.println("Sum of two integers: " + sum1); // Output: 5
        System.out.println("Sum of multiple integers: " + sum2); // Output: 10
    }
}

class VarargsOverloadingUtils {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add a variable number of integers using varargs
    public int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
