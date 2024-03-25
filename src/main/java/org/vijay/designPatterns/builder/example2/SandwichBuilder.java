package org.vijay.designPatterns.builder.example2;

public interface SandwichBuilder {
    SandwichBuilderImpl addCheese();
    SandwichBuilderImpl addVeggies();
    SandwichBuilderImpl addSauces();
    SandwichBuilderImpl addBread();
    SandwichBuilderImpl addMeat();
    SandwichBuilderImpl addPepperoni();
    Sandwich makeSandwich();


}
