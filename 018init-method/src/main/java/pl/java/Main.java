package pl.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		SameBeans sameBeans = context.getBean("sameBeans", SameBeans.class);
		sameBeans.checkIsWorking();
	}
}
