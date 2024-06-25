package it.ioprogrammatore.java.module.sealed;

// Define the sealed class AstronomicalObject
sealed abstract class AstronomicalObject permits Star, Planet, Comet {
    private final String name;

    public AstronomicalObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void displayInfo();
}

// Define the subclass Star
final class Star extends AstronomicalObject {
    private final double luminosity; // in solar units

    public Star(String name, double luminosity) {
        super(name);
        this.luminosity = luminosity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Star: " + getName() + ", Luminosity: " + luminosity + " solar units");
    }
}

// Define the subclass Planet
final class Planet extends AstronomicalObject {
    private final boolean hasRings;

    public Planet(String name, boolean hasRings) {
        super(name);
        this.hasRings = hasRings;
    }

    @Override
    public void displayInfo() {
        System.out.println("Planet: " + getName() + ", Has Rings: " + hasRings);
    }
}

// Define the subclass Comet
final class Comet extends AstronomicalObject {
    private final double orbitalPeriod; // in years

    public Comet(String name, double orbitalPeriod) {
        super(name);
        this.orbitalPeriod = orbitalPeriod;
    }

    @Override
    public void displayInfo() {
        System.out.println("Comet: " + getName() + ", Orbital Period: " + orbitalPeriod + " years");
    }
}

// Main class to demonstrate the functionality
public class SealedClassExample {

    public static void main(String[] args) {
        AstronomicalObject sun = new Star("Sun", 1.0);
        AstronomicalObject jupiter = new Planet("Jupiter", true);
        AstronomicalObject halley = new Comet("Halley's Comet", 75.3);

        sun.displayInfo();
        jupiter.displayInfo();
        halley.displayInfo();
    }
}
