package org.example.entity;

import lombok.Data;

import java.util.Objects;

@Data
public class WeatherValue {
    private String main;

    private String mainDescription;

    private Double temp;

    private Double feelsLike;

    private Double tempMin;

    private Double tempMax;

    private Double pressure;

    private Double seaLevel;

    private Double grndLevel;

    private Double humidity;

    private Double tempKf;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        WeatherValue that = (WeatherValue) o;
        return Objects.equals(main, that.main) &&
                Objects.equals(mainDescription, that.mainDescription) &&
                Objects.equals(temp, that.temp) &&
                Objects.equals(feelsLike, that.feelsLike) &&
                Objects.equals(tempMin, that.tempMin) &&
                Objects.equals(tempMax, that.tempMax) &&
                Objects.equals(pressure, that.pressure) &&
                Objects.equals(seaLevel, that.seaLevel) &&
                Objects.equals(grndLevel, that.grndLevel) &&
                Objects.equals(humidity, that.humidity) &&
                Objects.equals(tempKf, that.tempKf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(main, mainDescription, temp, feelsLike, tempMin, tempMax, pressure, seaLevel, grndLevel, humidity, tempKf);
    }
}
