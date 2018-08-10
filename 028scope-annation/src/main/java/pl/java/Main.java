package pl.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		CounterUser bean = context.getBean("counterUser", CounterUser.class);
		
		System.out.println("bean.getPrototype1().getCounter()");
		System.out.println(bean.getPrototype1().getCounter());
		System.out.println(bean.getPrototype1().getCounter());
		System.out.println("bean.getPrototype2().getCounter()");
		System.out.println(bean.getPrototype2().getCounter());
		System.out.println(bean.getPrototype2().getCounter());
		System.out.println("bean.getSingleto1().getCounter()");
		System.out.println(bean.getSingleto1().getCounter());
		System.out.println(bean.getSingleto1().getCounter());
		System.out.println("bean.getSingleto2().getCounter()");
		System.out.println(bean.getSingleto2().getCounter());
		System.out.println(bean.getSingleto2().getCounter());
	}
}
