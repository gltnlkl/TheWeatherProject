package com.gulukal.project.business.modal;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@Entity
@Table(name = "weather_data")
public class WeatherData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long   oid;
	@Temporal(TemporalType.DATE)
	private Date   timestamp;
	private double temp;
	@ManyToOne
	@JoinColumn(name = "city_oid")
	private City   city;
}
