package org.vijay.designPatterns.builder.example2;

public class Sandwich {
    private boolean cheese;
    private boolean veggies;
    private boolean sauces;
    private boolean bread;
    private boolean meat;
    private boolean pepperoni;

    public Sandwich(boolean cheese, boolean veggies, boolean sauces, boolean bread, boolean meat, boolean pepperoni) {
        this.cheese = cheese;
        this.veggies = veggies;
        this.sauces = sauces;
        this.bread = bread;
        this.meat = meat;
        this.pepperoni = pepperoni;
    }

    @Override
    public String toString() {
        return "SandwichBuilder{" +
                "cheese=" + cheese +
                ", veggies=" + veggies +
                ", sauces=" + sauces +
                ", bread=" + bread +
                ", meat=" + meat +
                ", pepperoni=" + pepperoni +
                '}';
    }
}
