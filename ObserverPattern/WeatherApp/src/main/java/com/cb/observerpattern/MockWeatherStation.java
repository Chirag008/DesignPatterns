package com.cb.observerpattern;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class MockWeatherStation implements Subject{

    List<Observer> observers;
    WeatherData data = new WeatherData();

    public MockWeatherStation(){
        observers = new ArrayList<Observer>();
    }

    public void turnUpTheStation(){
        while(true){
            this.data = getCurrentWeatherData();
            measurementsChanged();
            // wait for 5 seconds
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            
        }
    }

    public WeatherData getCurrentWeatherData(){
        WeatherData data = new WeatherData();
        Random random = new Random();
        double mockTemperature = 5 + random.nextFloat() * (40-5);
        double mockWindSpeed = 2 + random.nextFloat() * (30-2);
        long mockHumidity = random.nextInt(100);

        data.setTemperature(mockTemperature);
        data.setHumidity(mockHumidity);
        data.setWindSpeed(mockWindSpeed);
        return data;
    }

    public void measurementsChanged(){
        notifyAllObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        this.observers.remove(observer);
       
    }

    @Override
    public void notifyAllObservers() {
        for(Observer observer: this.observers){
            observer.update(data);
        }
    }

    
}
