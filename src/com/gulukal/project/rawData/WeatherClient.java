package com.gulukal.project.rawData;



import com.gulukal.project.business.modal.City;
import com.gulukal.project.utils.Logging;
import com.gulukal.project.utils.MongoUtilities;

import lombok.Getter;

public class WeatherClient implements Runnable {
	@Getter
	private City city;

	public WeatherClient(City city) {
		this.city = city;
	}

	@Override
	public void run() {
		Logging.getInstance().logInfo(this.getName() + " is up and runnig");
		try {
			while (true) {
				String actWeather = getWeatherData(this.city.getLatitude(), this.city.getLongitude());
				MongoUtilities.INSTANCE.parseCurrentWeatherJSON(actWeather);
				String forecastWeather = getForecastData(city.getName());
				MongoUtilities.INSTANCE.parseForecastWeatherJSON(forecastWeather);
				Thread.sleep(300000);
			}
		}
		catch (InterruptedException ex) {
			Logging.getInstance().logError(this.getClass().getSimpleName() + " --> " + ex.getMessage());
		}
	}

	public String getName() {
		return this.getClass().getSimpleName();
	}
}
