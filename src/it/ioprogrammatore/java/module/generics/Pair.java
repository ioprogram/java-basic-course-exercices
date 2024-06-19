package it.ioprogrammatore.java.module.generics;

/*
Objective: Understand how to use generics with multiple type parameters by creating a generic Pair class.

Problem: Write a generic class Pair that can store two objects of different types. Implement methods to set and get the first and second elements of the pair.

Steps:
-Create a generic class Pair<T, U>.
-Add private fields of type T and U to store the elements.
-Implement methods setFirst(T first), T getFirst(), setSecond(U second), and U getSecond().
-Write a main method to demonstrate the functionality with different types of pairs.
 */

public class Pair<T, U> {
    private T first;
    private U second;

    public void setFirst(T first) {
        this.first = first;
    }

    public T getFirst() {
        return first;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public U getSecond() {
        return second;
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>();
        pair.setFirst("Age");
        pair.setSecond(30);
        System.out.println("Pair: " + pair.getFirst() + " = " + pair.getSecond());

        Pair<Double, String> anotherPair = new Pair<>();
        anotherPair.setFirst(99.99);
        anotherPair.setSecond("Price");
        System.out.println("Pair: " + anotherPair.getFirst() + " = " + anotherPair.getSecond());
    }
}
