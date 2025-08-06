package org.example.repository;

import org.example.entity.CurrentWeatherRecord;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrentWeatherRecordRepo extends MongoRepository<CurrentWeatherRecord, Long> {
    CurrentWeatherRecord findById();
}
