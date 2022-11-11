package com.kodilla.testing.calculator;

public class Calculator {
    private int a;
    private int b;

    public void add(int a, int b){
        int z = a +b;
        System.out.println(""+a + " + " + b + "= " +z );
    }

    public void subtract(int a, int b){
        int c = a - b;
        System.out.println(""+a + " - " + b + "= " +c );
    }
}
