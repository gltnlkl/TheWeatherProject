package com.gulukal.project;

import com.gulukal.project.business.BusinessClient;
import com.gulukal.project.user.UserClient;
import com.gulukal.project.utils.Logging;

public class WeatherManagement {

	public static void main(String[] args) {
		Logging.getInstance().logInfo("Weather Management System is startin...");
		
		BusinessClient businessClient = new BusinessClient();
		new Thread(businessClient, businessClient.getClass().getSimpleName()).start();  
		
		UserClient userClient = new UserClient();
		new Thread(userClient, userClient.getName()).start();   // thread çalýþtýrma
		Logging.getInstance().logInfo("Weather Management System has started");
	}
}
