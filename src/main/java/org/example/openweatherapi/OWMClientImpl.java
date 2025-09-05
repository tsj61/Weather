package org.example.openweatherapi;

import lombok.RequiredArgsConstructor;
import org.example.entity.City;
import org.example.entity.CurrentWeather;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OWMClientImpl implements OWMClient {

    @Value("${openweather.api.key}")
    private String apiKey;

    private final WebClient webClient;

    @Override
    public CurrentWeather getCurrentWeatherDataByLatAndLon(Float latitude, Float longitude) {
        return webClient.get()
                .uri("/data/2.5//weather?lat=" + latitude + "&lon=" + longitude + "&appid=" + apiKey)
                .retrieve()
                .bodyToMono(CurrentWeather.class)
                .block();
    }

    @Override
    public List<City> getCityByName(String cityName) {
        return webClient.get()
                .uri("/geo/1.0/direct?q=" + cityName + "&limit=1" + "&appid=" + apiKey)
                .retrieve()
                .bodyToFlux(City.class)
                .collectList()
                .block();
    }
}
