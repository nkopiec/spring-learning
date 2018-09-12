package pl.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		//ApplicationContext context = new AnnotationConfigApplicationContext(LoggersConfiguration.class, RepositoriesConfiguration.class);

		UsersRepository usersRepository = context.getBean("usersRepository", UsersRepository.class);
		usersRepository.createUser("Nowak");
		
	}

}
