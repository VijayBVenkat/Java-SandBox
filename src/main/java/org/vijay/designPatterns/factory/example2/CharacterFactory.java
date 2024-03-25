package org.vijay.designPatterns.factory.example2;

public class CharacterFactory {
    public CharacterAttributes createCharacter(String characterName) {
        if ("Warrior".equals(characterName)) {
            return new Warrior();
        } else if ("Archer".equals(characterName)) {
            return  new Archer();
        } else {
            throw new IllegalArgumentException("Invalid character name");
        }
    }
}
