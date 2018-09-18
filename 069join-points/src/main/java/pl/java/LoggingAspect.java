package pl.java;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

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
	
	public void methodExecuted(JoinPoint joinPoint) {
		joinPoint.getKind();
		joinPoint.getArgs();
		joinPoint.getSignature();
		joinPoint.getThis();
		logger.info("Method " + joinPoint.getSignature().getName() + " has already been executed");
	}
}
