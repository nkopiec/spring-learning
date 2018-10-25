package pl.java.controllers;

import java.util.Map;

import org.springframework.context.annotation.Primary;

public class User {
	private String name;
	private Object age;
	private Object salary;
	private long id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
	}

	public Object getAge() {
		return age;
	}

	public Object getSalary() {
		return salary;
	}

	public void setAge(Object age) {
		this.age = age;
		
	}

	public void setSalary(Object salary) {
		this.salary = salary;
	}
	
	public Map<String, ?> getId() {
		return null;
	}

}
