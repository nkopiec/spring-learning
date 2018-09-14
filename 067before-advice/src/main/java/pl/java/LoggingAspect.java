package pl.java;

import java.util.logging.Logger;

public class LoggingAspect {
	public void logExecution() {
		Logger.getLogger(getClass().getName()).info("Method execution");
	}
}
