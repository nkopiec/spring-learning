package pl.java;

import java.util.Date;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Service("withDeteLogger")

public class WithDeteLogger implements Logger{

	public void log(String message) {
		System.out.println(new Date() + message);
	}
}
