package org.vijay.designPatterns.factory.example1;

import org.vijay.designPatterns.factory.example1.ShapeFactoryMethod;

public class Main {
    public static void main(String[] args) {
        ShapeFactoryMethod shapeFactory = new ShapeFactoryMethod();
        Shape shapeObj = shapeFactory.getShapeInstance("Square");
        double shapeArea = shapeObj.getArea();
    }

}
