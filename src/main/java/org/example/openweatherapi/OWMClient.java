package org.example.openweatherapi;

public interface OWMClient {
    String getCurrentWeatherDataByLatAndLon(Float longitude, Float latitude);
}
