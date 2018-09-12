package pl.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
	//	ApplicationContext context = new ClassPathXmlApplicationContext("loggers.xml", "repositories.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		context.getBean("usersRepositories", UsersRepository.class).createUser("Janek");
		
	}

}
