package org.example.service;

import org.example.dto.CityDTO;
import org.example.entity.City;

import java.util.List;

public interface CityService {
    List<City> getAllCities();

    CityDTO getCityByName(String name);

    CityDTO getCityById(String cityId);
}
