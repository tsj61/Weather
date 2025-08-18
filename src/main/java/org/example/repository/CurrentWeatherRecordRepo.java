package org.example.repository;

import org.example.entity.Weather;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CurrentWeatherRecordRepo extends MongoRepository<Weather, UUID> {
}
