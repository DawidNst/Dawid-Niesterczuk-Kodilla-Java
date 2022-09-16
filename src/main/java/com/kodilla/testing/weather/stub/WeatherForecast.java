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

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double averageTemperature() {
        double result = 0.0;
        Set<Map.Entry<String,Double>>entries=temperatures.getTemperatures().entrySet();


        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            result = result + temperature.getValue();
        }

        return result / entries.size();

    }

    public double medianTemperature() {
        List<Double> medianTemp = new ArrayList<>();
        double result = 0.0;
        double average = 0.0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            medianTemp.add(temperature.getValue());
        }

        Collections.sort(medianTemp);
        if (medianTemp.size() % 2 == 0) {
            average = medianTemp.get(medianTemp.size() / 2) + medianTemp.get(medianTemp.size() / 2 - 1);
            result = average / 2;
        } else {
            result = medianTemp.get(medianTemp.size() / 2);
        }
        return result;
    }
}