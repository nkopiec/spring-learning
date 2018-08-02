package pl.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext konfiguracja = new ClassPathXmlApplicationContext("Konfiguraja.xml");
		User user = konfiguracja.getBean("sameUser", User.class);
		System.out.println(user);
	}

}
