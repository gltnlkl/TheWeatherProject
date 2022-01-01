package com.gulukal.project.common.geograpy;

import org.bson.codecs.pojo.annotations.BsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder

public class City {

	
	@BsonProperty( value= "city_name")
	private String name;
	@BsonProperty( value= "altitude")
	private double altitude;
	@BsonProperty( value= "latitude")
	private double latitude;
	@BsonProperty( value= "langitude")
	private double longitude;
	@BsonProperty( value= "city_code")
	private String cityCode;
	@BsonProperty( value= "city_population")
	private long    population;

	
}