package org.vijay.designPatterns.decorator.example1;

public interface Burger {
    String description = null;
    double cost = 0.0;
    public abstract String getDescription();
    public abstract double getCost();
}
