package com.kodilla.exception.test;

public class FlightSearchRunner {

    public static void main(String[] args) {

        FlightSearch flightSearch = new FlightSearch();

        try{
            flightSearch.findFlight(new Flight("Oslo", "Warsaw"));
        }catch (RouteNotFoundException e){
            System.out.println("Choose different airport " +e);
        }

        System.out.println("Now is fine");

        try{
            flightSearch.findFlight(new Flight("Amsterdam", "Warsaw"));
        }catch (RouteNotFoundException e){
            System.out.println("Choose different airport " +e);
        }finally{
            System.out.println("have a nice journey1");
        }


    }
}
