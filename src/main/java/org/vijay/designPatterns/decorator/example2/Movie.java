package org.vijay.designPatterns.decorator.example2;

public class Movie implements BookMyShow{
    @Override
    public String getShowName() {
        return "Movie";
    }

    @Override
    public double getCost() {
        return 220.0;
    }
}
