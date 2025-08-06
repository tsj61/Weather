package org.example.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.Objects;

@Getter
@Setter
//@Document(collection = "city")
public class City {
    private Long id;

    private Float longitude;

    private Float latitude;

    @Indexed
    private String cityName;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(id, city.id) &&
                Objects.equals(longitude, city.longitude) &&
                Objects.equals(latitude, city.latitude) &&
                Objects.equals(cityName, city.cityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, longitude, latitude, cityName);
    }
}
