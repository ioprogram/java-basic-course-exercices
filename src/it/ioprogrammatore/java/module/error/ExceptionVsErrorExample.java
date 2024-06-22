package it.ioprogrammatore.java.module.error;

public class ExceptionVsErrorExample {

    public static void main(String[] args) {
        handleException();
        handleError();
    }

    // Method to demonstrate exception handling
    public static void handleException() {
        try {
            int result = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught: Division by zero is not allowed.");
        } finally {
            System.out.println("Exception handling complete.");
        }
    }

    // Method to demonstrate error handling
    public static void handleError() {
        try {
            // Attempting to create a very large array to simulate OutOfMemoryError
            int[] largeArray = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.out.println("Error Caught: Out of memory.");
        } finally {
            System.out.println("Error handling complete.");
        }
    }
}
