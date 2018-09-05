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

		
		Employee employe1 = new Employee();
		Phone phone1 = new Phone();
		Phone phone2 = new Phone();
		employe1.setFirstName("Ewelina");
		employe1.setLastName("Solecka");
		employe1.setSalary(12342.12);
		phone1.setType("mobile");
		phone2.setType("home");
		phone1.setNumber("23813923");
		phone2.setNumber("17342948");
		java.util.List<Phone> phones = new ArrayList<>();
		phones.add(phone1);
		phones.add(phone2);
		employe1.setPhones(phones);
		
		entityManager.getTransaction().begin();
		entityManager.persist(employe1);
		//entityManager.persist(phone1);
		//entityManager.persist(phone2);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
	}
	
	
}
