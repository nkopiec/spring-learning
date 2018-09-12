package pl.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoggersConfiguration {
	
		@Bean
		public Logger logger() {
			return new WithDeteLogger();
		}
	
}
