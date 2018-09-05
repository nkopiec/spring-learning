package pl.java;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import antlr.collections.List;
import domain.Employee;
import domain.Phone;


public class Main {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	
	public static void main(String[] args) {
		entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
		entityManager = entityManagerFactory.createEntityManager();

		Employee employee = entityManager.find(Employee.class, 1L);
		
		java.util.List<Phone> phones = employee.getPhones();
		System.out.println(phones);
		
		entityManager.close();
		entityManagerFactory.close();
	}
	
	
}
