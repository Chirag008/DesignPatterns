package com.cb.observerpattern;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    public static void main(String[] args) throws InterruptedException {
        MockWeatherStation station = new MockWeatherStation();
        MobileDisplay mobileDisplay = new MobileDisplay();
        WeatherPredictor weatherPredictor = new WeatherPredictor();
        station.registerObserver(mobileDisplay);
        station.registerObserver(weatherPredictor);
        
        station.turnUpTheStation();
    }
}
