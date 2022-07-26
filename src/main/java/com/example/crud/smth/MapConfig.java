package com.example.crud.smth;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "app.maps")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MapConfig {
    String number;
    String inn;
    String ogrn;
}
