package pl.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
	
		User user= context.getBean("user", User.class);
		System.out.println(user);
		
		User user2= context.getBean("user2", User.class);
		System.out.println(user2);
	
	}

}
