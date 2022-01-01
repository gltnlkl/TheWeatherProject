package com.gulukal.project.business.modal;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.HashCodeExclude;
import org.apache.commons.lang3.builder.ToStringExclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@Entity
@Table(name = "city")
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long              oid;
	private String            name;
	private long              population;
	private String            code;
	private double            langitude;
	private double            longitude;
	private double            altitude;
	@ToStringExclude
	@HashCodeExclude
	@ManyToOne
	@JoinColumn(name = "country_oid")
	private Country           country;
	@OneToMany(mappedBy = "city")
	private List<WeatherData> data;

	public void addWeatherData(WeatherData data) {
		if (this.data == null) {
			this.data = new ArrayList<>();
		}
		this.data.add(data);
	}
}
