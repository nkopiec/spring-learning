package pl.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Konfiguracja.xml");

		UsersRepository usersRepository = context.getBean("usersRepository", UsersRepository.class);

		
		usersRepository.createUser("Nowak");
	}

}
