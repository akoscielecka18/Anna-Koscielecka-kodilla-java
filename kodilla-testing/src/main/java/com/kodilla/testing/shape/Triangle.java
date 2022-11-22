package com.kodilla.testing.shape;
import com.kodilla.testing.shape.Shape;

public class Triangle implements Shape{

    private double c, b;

    public Triangle(double c, double b){
        this.c = c;
        this.b = b;
    }
    @Override
    public String getShapeName() {
        return "triangle";
    }

    @Override
    public double getField() {
        return c*b;
    }
}
