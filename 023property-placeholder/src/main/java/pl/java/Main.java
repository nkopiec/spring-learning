package pl.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		SomeBean bean = context.getBean("someBean", SomeBean.class);
		System.out.println(bean.getProperty() );
		
		DatabaseRepository datebase = context.getBean("myDatebase", DatabaseRepository.class);
		System.out.println(datebase);
		
	}
}
