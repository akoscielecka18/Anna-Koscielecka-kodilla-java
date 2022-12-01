package com.kodilla.exception.test;


public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(5.0, 7.2);
        } catch (Exception e) {
            System.out.println("Everything is fine" +e);
        } finally {
            System.out.println("Great!");
        }
    }
}
