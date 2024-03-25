package org.vijay.designPatterns.decorator.example1;

public class ExtraCheese implements BurgerDecorator{
    private Burger burger;

    public ExtraCheese(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + " with extra cheese";
    }

    @Override
    public double getCost() {
        return burger.getCost() + 30.0;
    }
}
