package org.example.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Main {
    @JsonProperty("temp")
    private Double temp;

    @JsonProperty("feels_like")
    private Double feelsLike;

    @JsonProperty("temp_min")
    private Double tempMin;

    @JsonProperty("temp_max")
    private Double tempMax;

    @JsonProperty("pressure")
    private Double pressure;

    @JsonProperty("sea_level")
    private Double seaLevel;

    @JsonProperty("grnd_level")
    private Double grndLevel;

    @JsonProperty("humidity")
    private Double humidity;
}
