package org.vijay.designPatterns.factory.example1;

public class Square implements Shape{
    @Override
    public double getArea() {
        double area = Math.pow(sqLen, 2);
        System.out.println("Area of Square " + area);
        return area;
    }
}
