package org.vijay.designPatterns.builder.example2;

public class Main {
    public static void main(String[] args) {
        //SandwichBuilder veggie = new SandwichConstructorBuilder().setBread(true).setVeggies(true).setCheese(true).setSandwich();

        Sandwich vegSandwich = new SandwichBuilderImpl().addBread().addCheese().addVeggies().makeSandwich();
        System.out.println(vegSandwich);
    }
}
