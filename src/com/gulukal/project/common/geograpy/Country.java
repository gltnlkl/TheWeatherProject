package com.gulukal.project.common.geograpy;

import java.util.ArrayList;

import org.bson.codecs.pojo.annotations.BsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder

public class Country {

	@BsonProperty (value="country_name")
	private String          name;
	@BsonProperty (value="capital")
	private City            capital;
	@BsonProperty (value="telcode")
	private int             telCode;
	@BsonProperty (value="country_code")
	private String          countryCode;
	@BsonProperty (value="cities")
	private ArrayList<City> cities;
	@BsonProperty (value="country_population")
	private long            population;

}