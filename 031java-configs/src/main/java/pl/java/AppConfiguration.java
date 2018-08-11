package pl.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
	@Bean
	public Logger logger() {
		return new WithDeteLogger();
	}
	@Bean
	public UsersRepository usersRepository() {
		UsersRepositoryImpl usersRepository = new UsersRepositoryImpl();
		usersRepository.setLogger(logger());
		return usersRepository;
	}
}
