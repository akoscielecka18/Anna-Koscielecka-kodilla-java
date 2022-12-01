package com.kodilla.exception.test;

import java.io.IOException;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {

        try{
            throw new ArithmeticException();
        }catch(RuntimeException c){
            if (b == 0) {
                System.out.println("Change divisor");
            }
        } finally {
            System.out.println("Remember: You can not divided by zero");
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3, 0);

        System.out.println(result);
    }
}
