package pl.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
	@Bean(initMethod = "initMethod",destroyMethod = "destroyMethod")
	public SomeBean someBean() {
		return new SomeBean();
	}
}
