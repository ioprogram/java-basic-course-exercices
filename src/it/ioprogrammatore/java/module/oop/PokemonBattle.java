package it.ioprogrammatore.java.module.oop;


/*
Exercise: Pokémon Battle Simulation
Objective: Understand and implement key OOP principles using a Pokémon battle simulation.

Problem: Write a Java program that models a simple Pokémon battle. You need to create a base class Pokemon, and several subclasses representing different Pokémon types. Each Pokémon should have attributes like name, type, hit points (HP), and attack damage. You will also implement a battle mechanism where Pokémon can attack each other.

Steps:
Create the base class Pokemon:

Properties: String name, String type, int hp, int attackDamage
Constructor: A constructor that initializes the properties.
Methods: void attack(Pokemon opponent), void takeDamage(int damage), and void displayStatus()
Create subclasses for different Pokémon types:

FirePokemon
WaterPokemon
GrassPokemon
Each subclass should call the superclass constructor and may have additional properties or methods specific to its type.
Implement the battle mechanism:

A method to simulate a battle where two Pokémon attack each other in turns until one of them faints (HP reaches 0).
Write a main method to demonstrate the battle:

Create instances of different Pokémon types.
Simulate a battle between two Pokémon and display the status after each attack.

 */


abstract class Pokemon {
    protected String name;
    protected String type;
    protected int hp;
    protected int attackDamage;

    public Pokemon(String name, String type, int hp, int attackDamage) {
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.attackDamage = attackDamage;
    }

    public void attack(Pokemon opponent) {
        System.out.println(this.name + " attacks " + opponent.name + "!");
        opponent.takeDamage(this.attackDamage);
    }

    public void takeDamage(int damage) {
        this.hp -= damage;
        if (this.hp < 0) {
            this.hp = 0;
        }
        System.out.println(this.name + " takes " + damage + " damage. Remaining HP: " + this.hp);
    }

    public void displayStatus() {
        System.out.println(this.name + " (" + this.type + ") - HP: " + this.hp);
    }
}


class FirePokemon extends Pokemon {
    public FirePokemon(String name, int hp, int attackDamage) {
        super(name, "Fire", hp, attackDamage);
    }
}

class WaterPokemon extends Pokemon {
    public WaterPokemon(String name, int hp, int attackDamage) {
        super(name, "Water", hp, attackDamage);
    }
}

class GrassPokemon extends Pokemon {
    public GrassPokemon(String name, int hp, int attackDamage) {
        super(name, "Grass", hp, attackDamage);
    }
}

class PokemonBattle {
    public static void main(String[] args) {
        // Create instances of different Pokémon types
        Pokemon charmander = new FirePokemon("Charmander", 100, 20);
        Pokemon squirtle = new WaterPokemon("Squirtle", 100, 15);

        // Display initial status
        charmander.displayStatus();
        squirtle.displayStatus();

        // Simulate a battle
        System.out.println("\nBattle Start!");
        while (charmander.hp > 0 && squirtle.hp > 0) {
            charmander.attack(squirtle);
            if (squirtle.hp > 0) {
                squirtle.attack(charmander);
            }
        }

        // Display final status
        System.out.println("\nBattle End!");
        charmander.displayStatus();
        squirtle.displayStatus();

        // Announce the winner
        if (charmander.hp > 0) {
            System.out.println(charmander.name + " wins!");
        } else {
            System.out.println(squirtle.name + " wins!");
        }
    }
}
