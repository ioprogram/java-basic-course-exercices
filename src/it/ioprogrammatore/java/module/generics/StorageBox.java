package it.ioprogrammatore.java.module.generics;

/*
Objective: Understand how to create and implement a generic interface.
Problem: Write a generic interface Storage with methods to store and retrieve items. Implement this interface in a class StorageBox.

Steps:
-Create a generic interface Storage<T> with methods void store(T item) and T retrieve().
-Create a class StorageBox<T> that implements Storage<T>.
-Implement the methods in StorageBox.
-Write a main method to demonstrate the functionality with different types of items.

 */

interface Storage<T> {
    void store(T item);
    T retrieve();
}

class StorageBox<T> implements Storage<T> {
    private T item;

    @Override
    public void store(T item) {
        this.item = item;
    }

    @Override
    public T retrieve() {
        return item;
    }

    public static void main(String[] args) {
        Storage<String> stringStorage = new StorageBox<>();
        stringStorage.store("Hello, Generics!");
        System.out.println("String Storage: " + stringStorage.retrieve());

        Storage<Integer> integerStorage = new StorageBox<>();
        integerStorage.store(123);
        System.out.println("Integer Storage: " + integerStorage.retrieve());
    }
}
