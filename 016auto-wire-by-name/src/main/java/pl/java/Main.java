package pl.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		SameBean sameBean = context.getBean("sameBean", SameBean.class);
		
		System.out.println(sameBean.getInjectedBean1());
		System.out.println(sameBean.getInjectedBean2());
		
	}
}
