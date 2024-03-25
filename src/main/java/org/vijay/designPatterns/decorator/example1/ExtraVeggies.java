package org.vijay.designPatterns.decorator.example1;

public class ExtraVeggies implements BurgerDecorator{

    private Burger burger;

    public ExtraVeggies(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + " with extra veggies";
    }

    @Override
    public double getCost() {
        return burger.getCost() + 40.0;
    }
}
