package org.vijay.designPatterns.decorator.example1;

public class Main {
    public static void main(String[] args) {

        Burger burger = new ZingerBurger();
        System.out.println(burger.getDescription() + " " + burger.getCost());

        burger = new ExtraCheese(burger);
        System.out.println(burger.getDescription() + " " + burger.getCost());

        burger = new ExtraVeggies(burger);
        System.out.println(burger.getDescription() + " " + burger.getCost());
    }
}
