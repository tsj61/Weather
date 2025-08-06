package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.entity.CurrentWeatherRecord;
import org.example.service.CurrentWeatherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/current-weather")
@RequiredArgsConstructor
public class WeatherController {
    private final CurrentWeatherService currentWeatherRecordService;

    @PostMapping
    public ResponseEntity<Void> saveCurrentWeather(@RequestBody CurrentWeatherRecord currentWeatherRecord) {
        currentWeatherRecordService.addCurrentWeather(currentWeatherRecord);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
