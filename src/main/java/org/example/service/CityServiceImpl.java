package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.entity.City;
import org.example.repository.CityRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {

    private CityRepo cityRepo;

    @Override
    public List<City> getAllCities() {
        return cityRepo.getAll();
    }
}
