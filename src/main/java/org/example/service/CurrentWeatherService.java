package org.example.service;

import org.example.dto.CurrentWeatherDTO;
import org.example.entity.Weather;

public interface CurrentWeatherService {
    void addCurrentWeather(Weather currentWeatherRecord);

    CurrentWeatherDTO getCurrentWeatherByLatAndLon(Float latitude, Float longitude);
}
