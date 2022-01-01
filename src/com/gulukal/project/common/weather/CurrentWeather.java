package com.gulukal.project.common.weather;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class CurrentWeather {
    private String id;
    private List<Weather> weather;
    private MainValues main;
    private long visibility;
    private Wind wind;
    private Cloud clouds;	
    private long dt;
    private MoreData sys;
    private long timezone;
    private String name;
    private int cod;
}
