package it.ioprogrammatore.java.module.abstractandinterface;

/*
Objective: Understand how to define and implement abstract classes and interfaces in Java.

Problem: Write a Java program that models a vehicle management system. You need to create an abstract class Vehicle and an interface Serviceable. The Vehicle class should be extended by two concrete classes: Car and Bike. The Serviceable interface should be implemented by both Car and Bike.

Steps:
Create the abstract class Vehicle:

Properties: String make, String model, int year
Constructor: A constructor that initializes the properties.
Abstract methods: void start(), void stop()
Concrete method: void displayInfo(), which prints the vehicle's information.
Create the interface Serviceable:

Methods: void service()
Create the Car class that extends Vehicle and implements Serviceable:

Additional property: int numberOfDoors
Constructor: A constructor that calls the superclass constructor and initializes the additional property.
Implement the abstract methods start() and stop()
Implement the service() method
Create the Bike class that extends Vehicle and implements Serviceable:

Additional property: boolean hasCarrier
Constructor: A constructor that calls the superclass constructor and initializes the additional property.
Implement the abstract methods start() and stop()
Implement the service() method
Write a main method in the VehicleManagement class to demonstrate the functionality:

Create instances of Car and Bike
Call the start(), stop(), service(), and displayInfo() methods on each instance.
 */

// Abstract class Vehicle
abstract class Vehicle {
    String make;
    String model;
    int year;

    // Constructor
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Abstract methods
    public abstract void start();
    public abstract void stop();

    // Concrete method
    public void displayInfo() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
    }
}

// Interface Serviceable
interface Serviceable {
    void service();
}

// Car class that extends Vehicle and implements Serviceable
class Car extends Vehicle implements Serviceable {
    int numberOfDoors;

    // Constructor
    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    // Implement the abstract methods
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }

    // Implement the service method
    @Override
    public void service() {
        System.out.println("Car is being serviced.");
    }
}

// Bike class that extends Vehicle and implements Serviceable
class Bike extends Vehicle implements Serviceable {
    boolean hasCarrier;

    // Constructor
    public Bike(String make, String model, int year, boolean hasCarrier) {
        super(make, model, year);
        this.hasCarrier = hasCarrier;
    }

    // Implement the abstract methods
    @Override
    public void start() {
        System.out.println("Bike is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping.");
    }

    // Implement the service method
    @Override
    public void service() {
        System.out.println("Bike is being serviced.");
    }
}

// VehicleManagement class with the main method
public class VehicleManagement {
    public static void main(String[] args) {
        // Create instances of Car and Bike
        Car car = new Car("Toyota", "Corolla", 2020, 4);
        Bike bike = new Bike("Yamaha", "MT-07", 2019, true);

        // Call methods on the instances
        System.out.println("Car Information:");
        car.displayInfo();
        car.start();
        car.service();
        car.stop();

        System.out.println("\nBike Information:");
        bike.displayInfo();
        bike.start();
        bike.service();
        bike.stop();
    }
}