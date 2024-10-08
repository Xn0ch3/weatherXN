package ConsitiGroup.weather.dtos.Forecast;

import lombok.Data;

@Data
public class ForecastWeather {
    private long id;
    private String main;
    private String description;
    private String icon;
}
