package pl.java;

import java.util.Date;

public class LoggerImpl {
	public void log(String message) {
		System.out.println(new Date() + ": " + message);
	}
}
