package org.vijay.designPatterns.builder.example3;

public class Main {

    public static void main(String[] args) {
        Car alto = new CarBuilder().setTransmission("Manual").setColor("Silver").setFuel("Petrol").setCubicCapacity(800).buildCar();

        System.out.println(alto);
    }


}
