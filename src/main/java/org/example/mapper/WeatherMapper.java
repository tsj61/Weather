package org.example.mapper;

import org.example.dto.CurrentWeatherDTO;
import org.example.entity.Weather;
import org.mapstruct.Mapper;

@Mapper
public interface WeatherMapper {
    //TODO
    CurrentWeatherDTO toDto(Weather weather);
}
