package org.example.repository;

import org.example.entity.CurrentWeatherRecord;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CurrentWeatherRecordRepo extends MongoRepository<CurrentWeatherRecord, UUID> {
}
