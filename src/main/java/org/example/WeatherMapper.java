package org.example;

import org.example.dto.CurrentWeatherDTO;
import org.example.entity.Weather;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface WeatherMapper {
    //TODO
    CurrentWeatherDTO toDto(Weather weather);
}
