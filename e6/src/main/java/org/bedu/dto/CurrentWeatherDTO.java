package org.bedu.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CurrentWeatherDTO {
    private double temperature;
    private double windspeed;
    private double winddirection;
    private int weathercode;
    private int is_day;
    private String time;
}