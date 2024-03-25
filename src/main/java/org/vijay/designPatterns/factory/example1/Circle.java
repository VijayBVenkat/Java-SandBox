package org.vijay.designPatterns.factory.example1;

public class Circle implements Shape{
    @Override
    public double getArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle " + area);
        return area;
    }
}
