package pl.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.SystemPropertyUtils;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		SomeBean bean = context.getBean("someBean", SomeBean.class);
		System.out.println(bean.getGetString());
		System.out.println(bean.getLocale());
	
	}
}
