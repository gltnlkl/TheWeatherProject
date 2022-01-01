package com.gulukal.project.utils;

import java.lang.module.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.gulukal.project.business.modal.City;
import com.gulukal.project.business.modal.WeatherData;
import com.gulukal.project.common.geograpy.Country;

public class HibernateUtil {
	private static HibernateUtil instance;
	private Session              session;

	private final SessionFactory sessionFactory = createSessionFactory();

	private HibernateUtil() {
	}

	public static HibernateUtil getInstance() {
		if (instance == null)
			instance = new HibernateUtil();
		return instance;
	}

	private SessionFactory createSessionFactory() {
		try {
			Configuration configuration = new Configuration();

			configuration.addAnnotatedClass(Country.class);
			configuration.addAnnotatedClass(City.class);
			configuration.addAnnotatedClass(WeatherData.class);

			SessionFactory factory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
			return factory;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public SessionFactory getSessionFactory() {
		return this.sessionFactory;
	}

	public Session getOpenSession() {
		if (this.session == null || !this.session.isConnected())
			this.session = this.getSessionFactory().openSession();
		return this.session;
	}
}