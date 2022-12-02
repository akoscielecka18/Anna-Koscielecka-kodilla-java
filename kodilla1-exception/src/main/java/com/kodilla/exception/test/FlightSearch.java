package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public String findFlight(Flight flight) throws RouteNotFoundException{
            Map<String, Boolean> openAirport = new HashMap<>();

            openAirport.put("London", true);
            openAirport.put("Amsterdam", false);
            openAirport.put("Warsaw", true);
            openAirport.put("Rome", false);

            if(!openAirport.containsKey(flight.getArrivalAirport())){
                throw new RouteNotFoundException();
            }
            if(!openAirport.containsKey(flight.getDepartureAirport())){
                throw new RouteNotFoundException();
            }
            return " " +openAirport.get(flight.getArrivalAirport()) + " " + openAirport.get(flight.getDepartureAirport());

    }


}

