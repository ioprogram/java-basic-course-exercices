package it.ioprogrammatore.java.module.generics;

/*
Objective: Understand how to use bounded generics to restrict the types that can be used with generics.

Problem: Write a bounded generic class NumberBox that can only store objects of types that are subclasses of Number.

Steps:
-Create a generic class NumberBox<T extends Number>.
-Add a private field of type T to store the contents.
-Implement methods setContents(T contents) and T getContents().
-Write a main method to demonstrate the functionality with different types of numbers.
 */

public class NumberBox<T extends Number> {
    private T contents;

    public void setContents(T contents) {
        this.contents = contents;
    }

    public T getContents() {
        return contents;
    }

    public static void main(String[] args) {
        NumberBox<Integer> integerBox = new NumberBox<>();
        integerBox.setContents(123);
        System.out.println("Integer Box Contents: " + integerBox.getContents());

        NumberBox<Double> doubleBox = new NumberBox<>();
        doubleBox.setContents(99.99);
        System.out.println("Double Box Contents: " + doubleBox.getContents());

        // This will cause a compile-time error:
        // NumberBox<String> stringBox = new NumberBox<>();
    }
}
