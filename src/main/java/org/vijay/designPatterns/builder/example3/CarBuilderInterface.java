package org.vijay.designPatterns.builder.example3;

public interface CarBuilderInterface {
    CarBuilder setFuel (String fuel);
    CarBuilder setCubicCapacity (int cc);
    CarBuilder setTransmission (String transmission);
    CarBuilder setColor (String color);
    Car buildCar();
}
