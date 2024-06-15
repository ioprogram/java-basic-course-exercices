package it.ioprogrammatore.java.module.basics;
public class TypeCasting {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // Implicit casting

        System.out.println("Implicit casting from int to double: " + myDouble);

        double anotherDouble = 9.78;
        int anotherInt = (int) anotherDouble; // Explicit casting

        System.out.println("Explicit casting from double to int: " + anotherInt);

        float myFloat = (float) anotherDouble; // Explicit casting
        System.out.println("Explicit casting from double to float: " + myFloat);
    }
}