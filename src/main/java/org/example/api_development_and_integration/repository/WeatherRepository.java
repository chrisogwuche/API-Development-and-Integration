package org.example.api_development_and_integration.repository;

import org.example.api_development_and_integration.entity.Weather;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherRepository extends MongoRepository<Weather, String> {
}
