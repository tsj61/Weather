package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.entity.WeatherValue;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrentWeatherDTO {
    private String city;
    private WeatherValue weather;
    private LocalDateTime timestamp;
}

