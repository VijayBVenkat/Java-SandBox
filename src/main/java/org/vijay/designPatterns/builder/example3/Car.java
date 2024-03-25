package org.vijay.designPatterns.builder.example3;

public class Car {
    private String fuel;
    private int cc;
    private String transmission;
    private String color;

    public Car(String fuel, int cc, String transmission, String color) {
        this.fuel = fuel;
        this.cc = cc;
        this.transmission = transmission;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuel='" + fuel + '\'' +
                ", cc=" + cc +
                ", transmission='" + transmission + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
