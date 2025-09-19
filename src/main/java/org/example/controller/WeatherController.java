package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.entity.CurrentWeather;
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
    public ResponseEntity<Void> saveCurrentWeather(@RequestBody CurrentWeather currentCurrentWeatherRecord) {
        currentWeatherService.addCurrentWeather(currentCurrentWeatherRecord);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<CurrentWeather> getWeatherByLatAndLon(
            @RequestParam Float latitude,
            @RequestParam Float longitude
    ) {
        return new ResponseEntity<>(currentWeatherService.getCurrentWeatherByLatAndLon(latitude, longitude), HttpStatus.OK);
    }

    @GetMapping("/{cityId}")
    public ResponseEntity<CurrentWeather> getWeatherByCityId(@PathVariable String cityId) {
        CurrentWeather currentWeather = currentWeatherService.getCurrentWeatherByCityId(cityId);
        currentWeatherService.addCurrentWeather(currentWeather);
        return new ResponseEntity<>(currentWeather, HttpStatus.OK);
    }
}
