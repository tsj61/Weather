package org.example.service;

import lombok.AllArgsConstructor;
import org.example.entity.CurrentWeatherRecord;
import org.example.repository.CurrentWeatherRecordRepo;

@AllArgsConstructor
public class CurrentWeatherServiceImpl implements CurrentWeatherService {

    private CurrentWeatherRecordRepo currentWeatherRecordRepository;

    @Override
    public void addCurrentWeather(CurrentWeatherRecord currentWeatherRecord) {
        currentWeatherRecordRepository.save(currentWeatherRecord);
    }
}
