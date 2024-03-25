package org.vijay.designPatterns.builder.example2;

public class SandwichBuilderImpl implements SandwichBuilder{
    private boolean cheese;
    private boolean veggies;
    private boolean sauces;
    private boolean bread;
    private boolean meat;
    private boolean pepperoni;

    public SandwichBuilderImpl addCheese() {
        this.cheese = true;
        return this;
    }
    public SandwichBuilderImpl addVeggies() {
        this.veggies = true;
        return this;
    }
    public SandwichBuilderImpl addSauces() {
        this.sauces = true;
        return this;
    }
    public SandwichBuilderImpl addBread() {
        this.bread = true;
        return this;
    }
    public SandwichBuilderImpl addMeat() {
        this.meat = true;
        return this;
    }
    public SandwichBuilderImpl addPepperoni() {
        this.pepperoni = pepperoni;
        return this;
    }
    public Sandwich makeSandwich() {
        return new Sandwich(cheese, veggies, sauces, bread, meat, pepperoni);
    }

}
