package org.vijay.designPatterns.factory.example2;

public class Main {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        CharacterAttributes character = characterFactory.createCharacter("Warrior");
        character.attack();
    }
}
