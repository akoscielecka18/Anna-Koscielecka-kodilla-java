package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {

        this.temperatures = temperatures;
    }
    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
                resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }
    public double average(){
        double sum = 0.0;
        double value =0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            sum += temperature.getValue();
            value++;
        }
        return sum/value;
    }

    public double median(){
        List<Double> medianList = new ArrayList<>();
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            medianList.add(temperature.getValue());
            }

        Collections.sort(medianList);

        double calculateMediana = 0.0;
        if( medianList.size() % 2 == 0){
                calculateMediana = (medianList.get(medianList.size()-1) + medianList.get(medianList.size())/2);

        }else {
                calculateMediana = medianList.get((medianList.size()-1)/2);
        }
        return calculateMediana;
    }



}

