package org.vijay.designPatterns.factory.example2;

public class Archer implements CharacterAttributes {
    @Override
    public void attack() {
        System.out.println("Archer attacks...");
    }

    @Override
    public void defend() {
        System.out.println("Archer defends...");
    }
}
