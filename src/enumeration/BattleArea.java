package enumeration;

import java.util.Random;

abstract class Character {
    String name;
    int health;
    int strength;
    Random random = new Random();

    Character(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
    }

    abstract void attack(Character opponent);

    void takeDamage(int damage) {
        health = health - damage;
        if (health < 0) {
            health = 0;
        }
        System.out.println(name + " health: " + health);
    }

    boolean isAlive() {
        return health > 0;
    }
}

class Warrior extends Character {

    Warrior(String name) {
        super(name, 100, 15);
    }

    void attack(Character opponent) {
        int damage = strength + random.nextInt(5);
        System.out.println(name + " attacks!");
        opponent.takeDamage(damage);
    }
}

class Mage extends Character {

    Mage(String name) {
        super(name, 70, 25);
    }

    void attack(Character opponent) {
        int damage = strength + random.nextInt(10);
        System.out.println(name + " casts spell!");
        opponent.takeDamage(damage);
    }
}

public class BattleArea {
    public static void main(String[] args) {

        Character p1 = new Warrior("Warrior");
        Character p2 = new Mage("Mage");

        while (p1.isAlive() && p2.isAlive()) {
            p1.attack(p2);
            if (p2.isAlive()) {
                p2.attack(p1);
            }
        }

        if (p1.isAlive()) {
            System.out.println(p1.name + " wins!");
        } else {
            System.out.println(p2.name + " wins!");
        }
    }
}

