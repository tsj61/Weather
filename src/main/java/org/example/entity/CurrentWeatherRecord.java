package org.example.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@Document(collection = "weather_record")
public class CurrentWeatherRecord {

    @Id
    private Long id;

    private WeatherValue weather;

    private City city;

    private LocalDateTime timestamp;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CurrentWeatherRecord that = (CurrentWeatherRecord) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(weather, that.weather) &&
                Objects.equals(city, that.city) &&
                Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, weather, city, timestamp);
    }
}
