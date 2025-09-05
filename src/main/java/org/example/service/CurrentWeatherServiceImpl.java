package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.entity.CurrentWeather;
import org.example.openweatherapi.OWMClient;
import org.example.repository.CurrentWeatherRecordRepo;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CurrentWeatherServiceImpl implements CurrentWeatherService {

    private final CurrentWeatherRecordRepo currentWeatherRecordRepo;
    private final OWMClient owmClient;
    //private final WeatherMapper weatherMapper;

    @Override
    public void addCurrentWeather(CurrentWeather currentCurrentWeatherRecord) {
        currentWeatherRecordRepo.save(currentCurrentWeatherRecord);
    }

    @Override
    public CurrentWeather getCurrentWeatherByLatAndLon(Float latitude, Float longitude) {
        CurrentWeather currentWeather = owmClient.getCurrentWeatherDataByLatAndLon(latitude, longitude);
        return currentWeather;
    }
}
