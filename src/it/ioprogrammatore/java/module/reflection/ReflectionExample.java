package it.ioprogrammatore.java.module.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

// Example class with private fields and methods
class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            // Create an instance of Person
            Person person = new Person("Alice", 30);

            // Get the class object
            Class<?> personClass = person.getClass();

            // List all fields
            System.out.println("Fields:");
            Field[] fields = personClass.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field.getName());
            }

            // List all methods
            System.out.println("\nMethods:");
            Method[] methods = personClass.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(method.getName());
            }

            // Modify the value of the private field 'name'
            Field nameField = personClass.getDeclaredField("name");
            nameField.setAccessible(true); // Allow access to private field
            nameField.set(person, "Bob");
            System.out.println("\nModified name field.");

            // Invoke the private method 'printDetails'
            Method printDetailsMethod = personClass.getDeclaredMethod("printDetails");
            printDetailsMethod.setAccessible(true); // Allow access to private method
            printDetailsMethod.invoke(person);

        } catch (NoSuchFieldException e) {
            System.out.println("Error: The field does not exist.");
        } catch (NoSuchMethodException e) {
            System.out.println("Error: The method does not exist.");
        } catch (IllegalAccessException e) {
            System.out.println("Error: Illegal access.");
        } catch (InvocationTargetException e) {
            System.out.println("Error: Invocation target exception.");
        }
    }
}
