package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dto.CityDTO;
import org.example.entity.CurrentWeather;
import org.example.openweatherapi.OWMClient;
import org.example.repository.CurrentWeatherRecordRepo;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CurrentWeatherServiceImpl implements CurrentWeatherService {

    private final CurrentWeatherRecordRepo currentWeatherRecordRepo;
    private final CityService cityService;
    private final OWMClient owmClient;
    //private final WeatherMapper weatherMapper;

    @Override
    public void addCurrentWeather(CurrentWeather currentCurrentWeatherRecord) {
        currentWeatherRecordRepo.save(currentCurrentWeatherRecord);
    }

    @Override
    public CurrentWeather getCurrentWeatherByLatAndLon(Float latitude, Float longitude) {
        return owmClient.getCurrentWeatherDataByLatAndLon(latitude, longitude);
    }

    @Override
    public CurrentWeather getCurrentWeatherByCityId(String cityId) {
        CityDTO city = cityService.getCityById(cityId);
        return getCurrentWeatherByLatAndLon(city.getLatitude(), city.getLongitude());
    }
}
