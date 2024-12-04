package com.cb.observerpattern;

public class WeatherData{

    double temperature;
    long humidity;
    double windSpeed;

    public WeatherData(){
        this.temperature = 0.0;
        this.humidity = 0L;
        this.windSpeed = 0.0;
    }

    public WeatherData(double temperature, long humidity, double windSpeed){
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
    }

    public void setTemperature(double temp){
        this.temperature = temp;
    }

    public void setHumidity(long humidity){
        this.humidity = humidity;
    }

    public void setWindSpeed(double windSpeed){
        this.windSpeed = windSpeed;
    }

    public String toString(){
        return String.format("Data : [Temperature = %f degree C, Wind Speed = %f km/h, Humidity = %d ", this.temperature,
        this.windSpeed, this.humidity);
    }
}