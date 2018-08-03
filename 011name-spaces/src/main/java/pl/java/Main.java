package pl.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		SomeBean someBean = context.getBean("sameBean", SomeBean.class);
		SomeBean someBean2 = context.getBean("sameBean2", SomeBean.class);
	
		System.out.println(someBean.getStringValue());
		System.out.println(someBean2.getUser().getName());
	}

	

}
