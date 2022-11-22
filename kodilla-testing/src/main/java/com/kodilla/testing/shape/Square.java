package com.kodilla.testing.shape;
import com.kodilla.testing.shape.Shape;

public class Square implements Shape{

    private double a;

    public Square(double a){
        this.a = a;
    }
    @Override
    public String getShapeName() {
        return "square";

    }

    @Override
    public double getField() {
        return Math.pow(a, 2);
    }
}
