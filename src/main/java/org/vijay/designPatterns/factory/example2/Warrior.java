package org.vijay.designPatterns.factory.example2;

public class Warrior implements CharacterAttributes {
    @Override
    public void attack() {
        System.out.println("Warrior attacks...");
    }
    @Override
    public void defend() {
        System.out.println("Warrior defends...");
    }
}
