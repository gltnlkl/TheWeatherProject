package com.gulukal.project.utils;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Logging {
	private static Logging instance;

	private Logger logger;

	private Logging() {
	}

	public static Logging getInstance() {
		if (instance == null) {
			instance = new Logging();
		}
		return instance;
	}

	public Logger getLogger() {
		if (this.logger == null) {
			this.logger = LogManager.getLogger(this.getClass());
		}
		return this.logger;
	}

	public void logInfo(String log) {
		this.getLogger().info(log);
	}

	public void logError(String log) {
		this.getLogger().error(log);
	}
}
