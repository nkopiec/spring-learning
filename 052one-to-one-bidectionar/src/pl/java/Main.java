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
import domain.Cat;
import domain.Owner;

public class Main {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	
	public static void main(String[] args) {
		entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
		entityManager = entityManagerFactory.createEntityManager();

		Owner owner = new Owner();
		Cat cat = new Cat();
		owner.setFirstName("Tadeusz");
		owner.setLastName("Kowalczyk");
		cat.setName("Puszek");
		owner.setCat(cat);
		
		entityManager.getTransaction().begin();
		entityManager.persist(cat);
		entityManager.persist(owner);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
	}
	
	
}
