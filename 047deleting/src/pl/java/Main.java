package pl.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Staffs;

public class Main {

	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Staffs staffs = new Staffs();
		staffs.setFirstName("W³adys³w");
		staffs.setLastName("Kosierowski");
		staffs.setSalary(2153.30);
		
		entityManager.getTransaction().begin();
		entityManager.persist(staffs);
		entityManager.getTransaction().commit();
		
		entityManager.getTransaction().begin();
		entityManager.remove(staffs);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
	}

}
