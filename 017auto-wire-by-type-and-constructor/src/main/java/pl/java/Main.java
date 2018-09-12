package pl.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		Application application = context.getBean("application", Application.class);
		System.out.println(application.getDictionaryRepositories().getMapValue());
		System.out.println(application.getUsersRepository().exist("janek"));
	}
}
