package pl.java;

import java.util.Date;

public class LogerImpl implements Logger {

	public void log(String message) {
		System.out.println(new Date() + ": " + message );

	}

}
