package org.example.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Document(collection = "current_weather")
public class CurrentWeather {
    @Id
    private String id;

    private Coord coord;

    @JsonProperty("weather")
    private List<Weather> weathers;

    private Main main;

    private LocalDateTime timestamp = LocalDateTime.now();

    public CurrentWeather() {
    }

}

class Coord {
    @JsonProperty("lon")
    private String cityLon;

    @JsonProperty("lat")
    private String cityLat;
}
