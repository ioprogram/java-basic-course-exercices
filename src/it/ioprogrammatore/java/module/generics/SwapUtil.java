package it.ioprogrammatore.java.module.generics;

import java.util.ArrayList;
import java.util.List;


/*

Objective: Understand how to create and use generic methods.

Problem: Write a generic method swap that swaps the elements at two specified positions in a list.

Steps:
-Create a generic method swap(List<T> list, int i, int j).
-Implement the method to swap the elements at positions i and j.
-Write a main method to demonstrate the functionality with different types of lists.

 */

public class SwapUtil {

    public static <T> void swap(List<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("One");
        stringList.add("Two");
        stringList.add("Three");

        System.out.println("Before swap: " + stringList);
        swap(stringList, 0, 2);
        System.out.println("After swap: " + stringList);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        System.out.println("Before swap: " + integerList);
        swap(integerList, 1, 2);
        System.out.println("After swap: " + integerList);
    }
}
