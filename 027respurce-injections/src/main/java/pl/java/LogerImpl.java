package pl.java;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class LogerImpl implements Logger {
	
	public void log(String message) {
		System.out.println(new Date() + ": " + message );

	}

}
