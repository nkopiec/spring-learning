package pl.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		SomeBean someBean = context.getBean("someBean", SomeBean.class); 
		AnotherBean anotherBean = context.getBean("anotherBean", AnotherBean.class); 
		
		
		someBean.setSomething(null);
		someBean.setAnotherThing(null);
		someBean.getSomething();
		someBean.anotherMethod();
		
		anotherBean.setSomething(null);
		anotherBean.setAnotherThing(null);
		anotherBean.getSomething();
		anotherBean.anotherMethod();
	}
}
