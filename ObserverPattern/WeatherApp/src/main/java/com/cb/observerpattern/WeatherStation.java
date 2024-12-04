package com.cb.observerpattern;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class WeatherStation {
    
    private String weatherApiUrl = "https://api.open-meteo.com/v1/forecast?latitude=28.5694832&longitude=77.3222374&current=temperature_2m,wind_speed_10m,relative_humidity_2m";

    public WeatherStation(){

    }

    public WeatherData getCurrentWeatherData(){
        WeatherData currentWeatherData = new WeatherData();
        URL url;
        try {
            url = new URL(weatherApiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            String inline = "";
            Scanner scanner = new Scanner(url.openStream());
            while (scanner.hasNext()) {
                inline += scanner.nextLine();
            }
            scanner.close();
            JSONParser parser = new JSONParser();
            JSONObject object = (JSONObject) parser.parse(inline);
            JSONObject obj = (JSONObject) object.get("current");
            double curr_temp = (double) obj.get("temperature_2m");
            double curr_windSpeed = (double) obj.get("wind_speed_10m");
            long curr_humidity = (long) obj.get("relative_humidity_2m");

            currentWeatherData.setTemperature(curr_temp);
            currentWeatherData.setWindSpeed(curr_windSpeed);
            currentWeatherData.setHumidity(curr_humidity);

        } catch ( IOException | ParseException e) {
            e.printStackTrace();
        }
        
        return currentWeatherData;
    }

}
