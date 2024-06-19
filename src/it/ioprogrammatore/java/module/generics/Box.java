package it.ioprogrammatore.java.module.generics;

/*
Objective: Understand the basics of generics by creating a generic Box class.

Problem: Write a generic class Box that can store any type of object. Implement methods to set and get the contents of the box.

Steps:
-Create a generic class Box<T>.
-Add a private field of type T to store the contents.
-Implement methods setContents(T contents) and T getContents().
-Write a main method to demonstrate the functionality with different types of objects.
 */

public class Box<T> {
    private T contents;

    public void setContents(T contents) {
        this.contents = contents;
    }

    public T getContents() {
        return contents;
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setContents("Hello, Generics!");
        System.out.println("String Box Contents: " + stringBox.getContents());

        Box<Integer> integerBox = new Box<>();
        integerBox.setContents(123);
        System.out.println("Integer Box Contents: " + integerBox.getContents());
    }
}
