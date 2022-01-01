package com.gulukal.project.business;

import java.util.Date;

import org.hibernate.Session;

import com.gulukal.project.business.modal.Country;
import com.gulukal.project.business.modal.WeatherData;
import com.gulukal.project.common.geograpy.City;
import com.gulukal.project.utils.HibernateUtil;

public class BusinessTest {
	public static void main(String[] args) {
		
		WeatherData w1 = new WeatherData(0, new Date(), 15.3, null);
		WeatherData w2 = new WeatherData(0, new Date(), 25.3, null);

		City c1 = new City(0, "Ýst", 14567, "34", 0, 0, 0, null, null);
		c1.addWeatherData(w1);
		c1.addWeatherData(w2);
		w1.setCity(c1);
		w2.setCity(c1);
		
		Country country = new Country(0, "Türk", "TR", 56365356, c1, null);
		country.addCity(c1);
		country.setCapital(c1);
		c1.setCountry(country);
		
		Session session = HibernateUtil.getInstance().getOpenSession();
		session.getTransaction().begin();
		session.save(c1);
		session.getTransaction().commit();
		
	}

}
