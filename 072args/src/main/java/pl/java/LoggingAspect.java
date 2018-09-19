package pl.java;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class LoggingAspect {
	public void logExecution(JoinPoint joinPoint) {
		System.out.println(joinPoint.getSignature());
	}
	
	public void logWithStringExecution(String argument) {
		System.out.println("Argument: " + argument);
	}
}
