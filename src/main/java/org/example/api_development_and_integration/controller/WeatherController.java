package org.example.api_development_and_integration.controller;

import lombok.RequiredArgsConstructor;
import org.example.api_development_and_integration.dto.WeatherDto;
import org.example.api_development_and_integration.service.WeatherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping("/weather/{location-id}")
    public ResponseEntity<WeatherDto> checkWeather(@PathVariable (value = "location-id") String locationId){
        return weatherService.checkWeather(locationId);
    }

}
