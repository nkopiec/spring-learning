package pl.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");

		UsersRepository usersRepository = context.getBean("repozytoriumUzytkownikow", UsersRepository.class);

		
		usersRepository.createUser(" Nowak");
	}

}
