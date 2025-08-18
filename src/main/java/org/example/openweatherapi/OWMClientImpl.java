package org.example.openweatherapi;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@RequiredArgsConstructor
public class OWMClientImpl implements OWMClient {

    @Value("${openweather.api.key}")
    private String apiKey;

    private final WebClient webClient;

    @Override
    public String getCurrentWeatherDataByLatAndLon(Float latitude, Float longitude) {
        return webClient.get()
                .uri("/weather?lat=" + latitude + "&lon=" + longitude + "&appid=" + apiKey)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
