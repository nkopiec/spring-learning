package pl.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		context.registerShutdownHook();
		
		SameBean sameBean = context.getBean("sameBean", SameBean.class);
		sameBean.toWorking();
	
	}
}
