package it.ioprogrammatore.java.module.varargs;

public class VarargsMixedTypes {
    public static void main(String[] args) {
        // Create an instance of VarargsMixedTypes
        VarargsMixedTypesUtils example = new VarargsMixedTypesUtils();

        // Call the displayInfo() method with different numbers of arguments
        example.displayInfo("Test1", 3, 1.1, 2.2, 3.3);
        example.displayInfo("Test2", 2, 4.4, 5.5);

        // Output:
        // Label: Test1, Count: 3, Values: [1.1, 2.2, 3.3]
        // Label: Test2, Count: 2, Values: [4.4, 5.5]
    }
}

class VarargsMixedTypesUtils {
    // Method using varargs with mixed data types
    public void displayInfo(String label, int count, double... values) {
        System.out.print("Label: " + label + ", Count: " + count + ", Values: ");
        for (double value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
