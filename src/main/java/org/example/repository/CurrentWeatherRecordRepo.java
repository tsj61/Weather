package org.example.repository;

import org.example.entity.CurrentWeather;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CurrentWeatherRecordRepo extends MongoRepository<CurrentWeather, UUID> {
}
