package it.ioprogrammatore.java.module.constant;


public class ConstantsExample {

    // Custom constants using final keyword
    public static final int MAX_AGE = 100;
    public static final double PI = 3.14159;
    public static final boolean IS_ACTIVE = true;
    public static final String GREETING = "Hello, world!";

    public static void main(String[] args) {
        // Print custom constants
        System.out.println("Custom Constants:");
        System.out.println("MAX_AGE: " + MAX_AGE);
        System.out.println("PI: " + PI);
        System.out.println("IS_ACTIVE: " + IS_ACTIVE);
        System.out.println("GREETING: " + GREETING);

        // Print built-in constants
        System.out.println("\nBuilt-in Constants:");

        // Integer constants
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);

        // Double constants
        System.out.println("Double.MAX_VALUE: " + Double.MAX_VALUE);
        System.out.println("Double.MIN_VALUE: " + Double.MIN_VALUE);
        System.out.println("Double.NaN: " + Double.NaN);
        System.out.println("Double.POSITIVE_INFINITY: " + Double.POSITIVE_INFINITY);
        System.out.println("Double.NEGATIVE_INFINITY: " + Double.NEGATIVE_INFINITY);

        // Boolean constants
        System.out.println("Boolean.TRUE: " + Boolean.TRUE);
        System.out.println("Boolean.FALSE: " + Boolean.FALSE);

        // Math constants
        System.out.println("Math.PI: " + Math.PI);
        System.out.println("Math.E: " + Math.E);
    }
}
