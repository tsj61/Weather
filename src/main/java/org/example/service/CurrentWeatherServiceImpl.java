package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dto.CurrentWeatherDTO;
import org.example.entity.Weather;
import org.example.openweatherapi.OWMClient;
import org.example.repository.CurrentWeatherRecordRepo;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CurrentWeatherServiceImpl implements CurrentWeatherService {

    private final CurrentWeatherRecordRepo currentWeatherRecordRepo;
    private final OWMClient owmClient;

    @Override
    public void addCurrentWeather(Weather currentWeatherRecord) {
        currentWeatherRecordRepo.save(currentWeatherRecord);
    }

    @Override
    public CurrentWeatherDTO getCurrentWeatherByLatAndLon(Float latitude, Float longitude) {
        //TODO: перевод json в объект
        owmClient.getCurrentWeatherDataByLatAndLon(latitude, longitude);
        return null;
    }
}
