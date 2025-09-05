package org.example.openweatherapi;

import org.example.entity.City;
import org.example.entity.CurrentWeather;

import java.util.List;

public interface OWMClient {
    CurrentWeather getCurrentWeatherDataByLatAndLon(Float longitude, Float latitude);

    List<City> getCityByName(String cityName);
}
