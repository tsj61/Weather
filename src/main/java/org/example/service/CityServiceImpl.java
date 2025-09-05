package org.example.service;

import lombok.AllArgsConstructor;
import org.example.dto.CityDTO;
import org.example.entity.City;
import org.example.mapper.CityMapper;
import org.example.openweatherapi.OWMClient;
import org.example.repository.CityRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CityServiceImpl implements CityService {

    private final CityRepo cityRepo;
    private final OWMClient owmClient;
    private final CityMapper cityMapper;

    @Override
    public List<City> getAllCities() {
        return cityRepo.findAll();
    }

    @Override
    public CityDTO getCityByName(String name) {
        City city = cityRepo.findByName(name);

        if (city == null) {
            city = getCityFromOWM(name);
        }

        return cityMapper.toDTO(city);
    }

    private City getCityFromOWM(String name) {
        List<City> cities = owmClient.getCityByName(name);
        Optional<City> city = cities.stream().findFirst();
        city.ifPresent(cityRepo::save);
        return city.get();
    }
}
