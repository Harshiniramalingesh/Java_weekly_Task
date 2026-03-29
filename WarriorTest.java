package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.example.Warrior;

public class WarriorTest {
    private Warrior warrior;

    @BeforeEach
    void setUp() {
        warrior = new Warrior("Thor");
    }

    @Test
    void warriorShouldBeAliveInitially() {
        assertTrue(warrior.isAlive());
    }

    @Test
    void warriorShouldDieWhenHealthZero() {
        warrior.takeDamage(150);
        assertFalse(warrior.isAlive());
    }
}
