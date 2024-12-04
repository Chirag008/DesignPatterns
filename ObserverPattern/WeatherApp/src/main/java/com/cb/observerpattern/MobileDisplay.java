package com.cb.observerpattern;

public class MobileDisplay implements Observer {

    Subject subject;

    public MobileDisplay(Subject s){
        this.subject = s;
    }

    public void render(WeatherData weatherData){
        System.out.println("On Mobile Device Screen : " + weatherData);
    }

    @Override
    public void update(WeatherData data) {
        render(data);
    }
    
}
