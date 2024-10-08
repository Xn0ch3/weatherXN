package ConsitiGroup.weather.dtos;

import ConsitiGroup.weather.dtos.weather.*;
import lombok.Data;

@Data
public class WeatherData {
    private long id;
    private String name;
    private int cod;
    private long timezone;
    private Coords coords;
    private WeatherElement[] weather;
    private String base;
    private Main main;
    private long visibility;
    private Wind wind;
    private Clouds clouds;
    private long dt;
    private Sys sys;
}
