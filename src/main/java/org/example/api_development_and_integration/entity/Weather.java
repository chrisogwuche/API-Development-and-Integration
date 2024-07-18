package org.example.api_development_and_integration.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document
@Getter
@Setter
public class Weather {

    @Id
    private String id;
    private String temperature;
    @CreatedDate
    private Instant createdAt;
}
