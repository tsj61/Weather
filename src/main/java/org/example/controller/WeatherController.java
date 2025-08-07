package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.entity.CurrentWeatherRecord;
import org.example.service.CurrentWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/current-weather")
public class WeatherController {
    @Autowired
    private CurrentWeatherService currentWeatherService;

    @PostMapping
    public ResponseEntity<Void> saveCurrentWeather(@RequestBody CurrentWeatherRecord currentWeatherRecord) {
        currentWeatherService.addCurrentWeather(currentWeatherRecord);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
