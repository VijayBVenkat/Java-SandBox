package org.vijay.designPatterns.builder.example3;

public class CarBuilder implements CarBuilderInterface{
    private String fuel;
    private int cc;
    private String transmission;
    private String color;

    @Override
    public CarBuilder setFuel(String fuel) {
        this.fuel = fuel;
        return this;
    }

    @Override
    public CarBuilder setCubicCapacity(int cc) {
        this.cc = cc;
        return this;
    }

    @Override
    public CarBuilder setTransmission(String transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public Car buildCar() {
        return new Car(fuel, cc, transmission, color);
    }
}
