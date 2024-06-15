package it.ioprogrammatore.java.module.basics;

/*
Objective: Understand inheritance in Java.
Problem: Create a Vehicle class with attributes make and model, and a Car class that inherits from Vehicle and adds an attribute numDoors. Demonstrate the use of these classes.
 */

public class InheritanceExercise {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 4);
        car.display();
    }
}

class Vehicle {
    private String make;
    private String model;

    // Constructor
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Getter and Setter for make
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    // Getter and Setter for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Method to display vehicle details
    public void display() {
        System.out.println("Make: " + make + ", Model: " + model);
    }
}

class Car extends Vehicle {
    private int numDoors;

    // Constructor
    public Car(String make, String model, int numDoors) {
        super(make, model);
        this.numDoors = numDoors;
    }

    // Getter and Setter for numDoors
    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    // Method to display car details
    @Override
    public void display() {
        super.display();
        System.out.println("Number of Doors: " + numDoors);
    }
}
