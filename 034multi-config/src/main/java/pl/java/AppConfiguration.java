package pl.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({LoggersConfiguration.class, RepositoriesConfiguration.class})
public class AppConfiguration {
	
}

