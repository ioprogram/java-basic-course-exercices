package it.ioprogrammatore.java.module.basics;

/*
Objective: Understand the basics of classes and objects.
Problem: Define a Person class with attributes name and age, and methods to get and set these attributes. Create objects of this class and use these methods.
 */

public class OOPExercise {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        person1.display();

        Person person2 = new Person("Bob", 25);
        person2.display();

        person2.setName("Charlie");
        person2.setAge(28);
        person2.display();
    }
}

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Method to display person details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
