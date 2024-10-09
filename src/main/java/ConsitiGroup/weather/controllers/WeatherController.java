package ConsitiGroup.weather.controllers;

import ConsitiGroup.weather.dtos.ForecastData;
import ConsitiGroup.weather.dtos.WeatherData;
import ConsitiGroup.weather.services.WeatherService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @Operation(summary = "Obtiene el Clima Actual de una Cuidad Determinado", responses = {
            @ApiResponse(responseCode = "200" , description = "ok")
    })
    @GetMapping("/weather/{cityName}")
    public ResponseEntity<WeatherData> getWeatherByCityName(@PathVariable String cityName) {
        WeatherData weatherData = weatherService.getWeatherByCityName(cityName);
        return ResponseEntity.ok(weatherData);
    }

    @Operation(summary = "Obtiene el Clima Extendido por 5 dias de una Cuidad Determinada", responses = {
            @ApiResponse(responseCode = "200" , description = "ok")
    })
    @GetMapping("/forecast/{cityName}")
    public ResponseEntity<ForecastData> getWeather5daysByCityName(@PathVariable String cityName) {
        ForecastData forecastData = weatherService.getForecastByCityName(cityName);
        return ResponseEntity.ok(forecastData);
    }


}
