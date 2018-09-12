package pl.java.own_factory_methods;

import javax.naming.Context;

public class Main {

	public static void main(String[] args) {
		ApplicationContext konfiguracja = new ClassPathXmlApplicationContext("Konfiguraja.xml");
		User user = konfiguracja.getBean("sameUser", User.class);
		System.out.println(user);

	}

}
