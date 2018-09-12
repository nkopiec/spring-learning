package pl.java;



import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Employee;



public class Main {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
	
		Employee employee = new Employee();
		employee.setFirstName("Janusz");
		employee.setLastName("Kowalski");
		employee.setSalary(1234.44);
		employee.setLocality("Warszawa");
		employee.setZipCode("45-123");
		employee.setStreet("Kiatkowskiego");
		employee.setStreetNumber(12);
		
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
	}

}
