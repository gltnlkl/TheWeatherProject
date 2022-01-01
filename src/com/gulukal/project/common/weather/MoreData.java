package com.gulukal.project.common.weather;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class MoreData {
	private int    type;
	private long   id;
	private String country;
	private long   sunrise;
	private long   sunset;
}
