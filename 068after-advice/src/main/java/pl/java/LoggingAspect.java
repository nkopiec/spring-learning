package pl.java;

import org.apache.log4j.Logger;

public class LoggingAspect {
	private Logger logger = Logger.getLogger(getClass().getName());
	public void logExecution() {
		logger.info("Method execution");
	}
	
	public void warnIfNull(Object returnedValue) {
		if (returnedValue == null) {
			logger.warn("Returned value is null");
		}
	}
	
	public void serveException(RuntimeException exception) {
		logger.error("Exception: " + exception.getMessage());
	}
	
	public void methodExecuted() {
		logger.info("Method has already executed");
	}
}
