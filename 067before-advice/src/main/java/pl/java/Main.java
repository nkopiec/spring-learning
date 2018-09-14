package pl.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
	
		CustomerRepository customerRepository = context.getBean("customerRepository", CustomerRepository.class);
		System.out.println(customerRepository.getCustomerName(34L));
	}

}
