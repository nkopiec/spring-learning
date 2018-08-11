package pl.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "pl.java")
public class AppConfiguration {
//	@Bean
//	public Logger logger() {
//		return new WithDeteLogger();
//	}
//	@Bean
//	public UsersRepository usersRepository() {
//		UsersRepositoryImpl usersRepository = new UsersRepositoryImpl();
//		usersRepository.setLogger(logger());
//		return usersRepository;
//	}
}
