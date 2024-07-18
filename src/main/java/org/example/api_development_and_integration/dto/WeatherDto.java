package org.example.api_development_and_integration.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherDto {
    private String location_id;
    private String temperature;
}
