package org.example.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@Document(collection = "user_city_likes")
public class UserCityLikes {
    @Id
    @JsonProperty("Id")
    private String userId;

    private List<String> likedCityIds;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserCityLikes that = (UserCityLikes) o;
        return Objects.equals(userId, that.userId) && Objects.equals(likedCityIds, that.likedCityIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, likedCityIds);
    }
}
