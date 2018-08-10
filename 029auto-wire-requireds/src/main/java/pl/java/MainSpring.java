package pl.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Konfiguracja.xml");

		UsersRepository usersRepository = context.getBean("usersRepository", UsersRepository.class);

		
		User nowak = usersRepository.createUser("Nowak");
		System.out.println("urzytkownik" + nowak.getName() + " zasta³ utworzony");
	}

}
