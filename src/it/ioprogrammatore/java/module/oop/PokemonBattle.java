package it.ioprogrammatore.java.module.oop;

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
