package com.gulukal.project.business;

import com.gulukal.project.utils.Logging;

public class BusinessClient implements Runnable {

	@Override
	public void run() {
		Logging.getInstance().logInfo(BusinessClient.class.getSimpleName() + " is up and runnig");
		
		
	}
}
