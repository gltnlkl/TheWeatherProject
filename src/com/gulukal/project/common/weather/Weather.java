package com.gulukal.project.common.weather;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Weather {
    private long id;
    private String main;
    private String description;
}
