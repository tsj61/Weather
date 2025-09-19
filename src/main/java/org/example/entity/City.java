package org.example.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Getter
@Setter
@Document(collection = "city")
public class City {
    @Id
    private String id;

    @JsonProperty("lon")
    private Float longitude;

    @JsonProperty("lat")
    private Float latitude;

    private String country;

    private String state;

    private String name;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(id, city.id) &&
                Objects.equals(longitude, city.longitude) &&
                Objects.equals(latitude, city.latitude) &&
                Objects.equals(country, city.country) &&
                Objects.equals(state, city.state) &&
                Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, longitude, latitude, country, state, name);
    }
}
