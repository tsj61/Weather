package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.dto.CurrentWeatherDTO;
import org.example.entity.Weather;
import org.example.service.CurrentWeatherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/current-weather")
@AllArgsConstructor
public class WeatherController {

    private CurrentWeatherService currentWeatherService;

    @PostMapping
    public ResponseEntity<Void> saveCurrentWeather(@RequestBody Weather currentWeatherRecord) {
        currentWeatherService.addCurrentWeather(currentWeatherRecord);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<CurrentWeatherDTO> getWeatherByLatAndLon(
            @RequestParam Float latitude,
            @RequestParam Float longitude
    ) {
        return new ResponseEntity<>(currentWeatherService.getCurrentWeatherByLatAndLon(latitude, longitude), HttpStatus.OK);
    }
}
