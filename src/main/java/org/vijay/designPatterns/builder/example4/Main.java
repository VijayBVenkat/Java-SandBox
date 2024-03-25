package org.vijay.designPatterns.builder.example4;

public class Main {

    public static void main(String[] args) {

        Cat sony = new Cat.CatBuilder()
                    .setName("Sony")
                    .setGender("F")
                    .setColor("White")
                    .setVaccinated(true)
                    .buildCat();
        System.out.println(sony.toString());

        Cat tabby = new Cat.CatBuilder()
                .setName("Tabby")
                .setGender("M")
                .setColor("Tabby")
                .setVaccinated(true)
                .buildCat();
        System.out.println(tabby.toString());

    }
}
