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
		//employee.setId(1);
		employee.setFirstname("Stefan");
		employee.setLastName("Józefowski");
		employee.setSalary(1530.34);
		
		Employee employee2 = new Employee();
		employee2.setFirstname("Edward");
		employee2.setLastName("Kowalski");
		employee2.setSalary(2534.34);
		
		Employee employee3 = new Employee();
		employee3.setFirstname("Jakub");
		employee3.setLastName("Janiak");
		employee3.setSalary(432.87);
		
		Employee employee4 = new Employee();
		employee4.setFirstname("S³awomir");
		employee4.setLastName("Kozak");
		employee4.setSalary(2341.88);
		
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.persist(employee2);
		entityManager.persist(employee3);
		entityManager.persist(employee4);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
	}

}
