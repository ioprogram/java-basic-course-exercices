package it.ioprogrammatore.java.module.exceptions;

import java.lang.reflect.Method;

// Example class with a method
class ExampleClass {
    public void sayHello() {
        System.out.println("Hello, world!");
    }
}

public class NoSuchMethodExample {
    public static void main(String[] args) {
        try {
            // Create an instance of ExampleClass
            ExampleClass example = new ExampleClass();

            // Get the method 'sayHello' using reflection
            Method method = example.getClass().getMethod("sayHello");

            // Invoke the method on the instance
            method.invoke(example);

            // Try to get a method that does not exist to trigger NoSuchMethodException
            Method nonExistentMethod = example.getClass().getMethod("nonExistentMethod");

        } catch (NoSuchMethodException e) {
            System.out.println("Error: The method does not exist.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
