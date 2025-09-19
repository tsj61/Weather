package org.example.service;

import org.example.entity.CurrentWeather;

public interface CurrentWeatherService {
    void addCurrentWeather(CurrentWeather currentCurrentWeatherRecord);

    CurrentWeather getCurrentWeatherByLatAndLon(Float latitude, Float longitude);

    CurrentWeather getCurrentWeatherByCityId(String cityId);
}
