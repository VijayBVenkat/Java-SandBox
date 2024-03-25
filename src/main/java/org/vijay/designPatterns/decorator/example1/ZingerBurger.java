package org.vijay.designPatterns.decorator.example1;

public class ZingerBurger implements Burger{
    @Override
    public String getDescription() {
        return "Zinger Burger";
    }
    @Override
    public double getCost() {
        return 180.0;
    }
}
