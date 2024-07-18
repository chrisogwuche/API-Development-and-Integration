package org.example.api_development_and_integration.service;

import org.example.api_development_and_integration.dto.WeatherDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface WeatherService {

    ResponseEntity<WeatherDto> checkWeather(String locationId);
}
