package org.vijay.designPatterns.factory.example1;

import java.beans.JavaBean;

public class ShapeFactoryMethod {

    public Shape getShapeInstance (String shape) {
        if (shape.equals("Circle")) {
            return new Circle();
        } else if (shape.equals("Square")) {
            return new Square();
        } else {
            return new Shape() {
                @Override
                public double getArea() {
                    return 0;
                }
            };
        }
    }
}
