package pl.java;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
	@Bean
	public Somebean somebean() {
		return new Somebean();
	}
}
