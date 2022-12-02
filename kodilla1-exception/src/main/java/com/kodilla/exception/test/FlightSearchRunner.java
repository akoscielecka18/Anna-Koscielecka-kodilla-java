package com.kodilla.exception.test;

public class FlightSearchRunner {

    public static void main(String[] args) {

        FlightSearch flightSearch = new FlightSearch();

        try{
            flightSearch.findFilght(new Flight("Oslo", "Warsaw"));
        }catch (RouteNotFoundException e){
            System.out.println("Choose different airport " +e);
        }

        System.out.println("Now is fine");

        try{
            flightSearch.findFilght(new Flight("London", "Warsaw"));
        }catch (RouteNotFoundException e){
            System.out.println("Choose different airport " +e);
        }finally{
            System.out.println("have a nice journey");
        }


    }
}
