package ConsitiGroup.weather.services;

import ConsitiGroup.weather.dtos.ForecastData;
import ConsitiGroup.weather.dtos.WeatherData;

public interface WeatherService {
    WeatherData getWeatherByCityName(String cityName);
    ForecastData getForecastByCityName(String cityName);
}
