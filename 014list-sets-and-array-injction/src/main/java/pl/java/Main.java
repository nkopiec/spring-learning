package pl.java;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		SomeBean bean = context.getBean("someBean", SomeBean.class);
		
		System.out.println(bean.getIntegersList());
		System.out.println(bean.getStringList());
		System.out.println(Arrays.toString(bean.getLongArray()));
	}
}
