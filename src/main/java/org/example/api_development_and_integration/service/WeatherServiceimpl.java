package org.example.api_development_and_integration.service;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.example.api_development_and_integration.dto.WeatherDto;
import org.example.api_development_and_integration.entity.Weather;
import org.example.api_development_and_integration.repository.WeatherRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WeatherServiceimpl implements WeatherService {

    private final WeatherRepository weatherRepository;

    @Override
    public ResponseEntity<WeatherDto> checkWeather(String locationId) {

        Weather weather = weatherRepository.findById(locationId)
                .orElse(null);

        return (weather != null)? setLocationWeather(weather) : new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }

    private ResponseEntity<WeatherDto> setLocationWeather(Weather weather){
        WeatherDto weatherDto = new WeatherDto();
        weatherDto.setLocation_id(weather.getId());
        weatherDto.setTemperature(weather.getTemperature());
        return ResponseEntity.ok(weatherDto);
    }

    @PostConstruct
    public void onStartUp(){

        Weather weather = new Weather();
        weather.setId("1");
        weather.setTemperature("23");
        weatherRepository.save(weather);
    }
}
