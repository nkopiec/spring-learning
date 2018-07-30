package pl.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");

		UsersRepository usersRepository = context.getBean("repozytoriumUzytkownikow", UsersRepository.class);
		usersRepository.createUser(" Nowak");
		
		ApplicationContext context2 = new ClassPathXmlApplicationContext("konfiguracja.xml");
		SameBean bean = context2.getBean("sameBean", SameBean.class);
	} 

}
