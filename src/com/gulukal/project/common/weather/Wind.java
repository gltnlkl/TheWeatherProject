package com.gulukal.project.common.weather;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Wind {
    private double speed;
    private double deg;
    private double gust;
}
