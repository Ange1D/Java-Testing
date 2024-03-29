package org.bedu.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WeatherDTO {
    private double latitude;
    private double longitude;
    private double generationtime_ms;
    private int utc_offset_seconds;
    private String timezone;
    private String timezone_abbreviation;
    private double elevation;
    private CurrentWeatherDTO current_weather;
}
