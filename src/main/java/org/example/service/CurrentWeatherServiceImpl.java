package org.example.service;

import lombok.AllArgsConstructor;
import org.example.entity.CurrentWeatherRecord;
import org.example.repository.CurrentWeatherRecordRepo;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CurrentWeatherServiceImpl implements CurrentWeatherService {

    private final CurrentWeatherRecordRepo currentWeatherRecordRepo;

    @Override
    public void addCurrentWeather(CurrentWeatherRecord currentWeatherRecord) {
        currentWeatherRecordRepo.save(currentWeatherRecord);
    }
}
