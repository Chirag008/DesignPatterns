package com.cb.observerpattern;

public class WeatherPredictor implements Observer{

    Subject subject;

    public WeatherPredictor(Subject s){
        this.subject = s;
    }

    public void predict(WeatherData weatherData){
        StringBuilder weatherPrediction = new StringBuilder();
        String temperaturePrediction = "";
        String windPrediction = "";
    
        if(weatherData.temperature <= 20){
            temperaturePrediction = "Chilly";
        }else if (weatherData.temperature<=35){
            temperaturePrediction = "Cozy";
        }else{
            temperaturePrediction = "Hot";
        }

        if(weatherData.windSpeed <= 10){
            windPrediction = "Low wind";
        }else if (weatherData.windSpeed<=20){
            windPrediction = "Pleasant wind";
        }else{
            windPrediction = "Very Windy";
        }

        weatherPrediction.append("Weather Prediciton : The temperature will be ").append(temperaturePrediction)
        .append(" and it's going to be ").append(windPrediction);

        System.out.println(weatherPrediction.toString());
    }

    @Override
    public void update(WeatherData data) {
        predict(data);
    }
    
}
