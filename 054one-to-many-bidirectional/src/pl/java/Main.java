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
import domain.Employe2;
import domain.Phone;


public class Main {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	
	public static void main(String[] args) {
		entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
		entityManager = entityManagerFactory.createEntityManager();

		
		Employe2 employe2 = new Employe2();
		Phone phone1 = new Phone();
		Phone phone2 = new Phone();
		employe2.setFirstName("Ewelina");
		employe2.setLastName("Solecka");
		employe2.setSalary(12342.12);
		phone1.setType("mobile");
		phone2.setType("home");
		phone1.setEmploye2(employe2);
		phone2.setEmploye2(employe2);
		phone1.setNumber("23813923");
		phone2.setNumber("17342948");
		java.util.List<Phone> phones = new ArrayList<>();
		phones.add(phone1);
		phones.add(phone2);
		employe2.setPhones(phones);
		
		entityManager.getTransaction().begin();
		entityManager.persist(employe2);
		entityManager.persist(phone1);
		entityManager.persist(phone2);
		entityManager.getTransaction().commit();
		
		entityManager.refresh(employe2);
		
		entityManager.close();
		entityManagerFactory.close();
	}
	
	
}
