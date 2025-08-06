package org.example.service;

import org.example.entity.CurrentWeatherRecord;
import org.springframework.stereotype.Service;

@Service
public interface CurrentWeatherService {
    void addCurrentWeather(CurrentWeatherRecord currentWeatherRecord);
}
