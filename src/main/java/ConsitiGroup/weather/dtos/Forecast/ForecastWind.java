package ConsitiGroup.weather.dtos.Forecast;

import lombok.Data;

@Data
public class ForecastWind {
    private double speed;
    private long deg;
    private double gust;
}
