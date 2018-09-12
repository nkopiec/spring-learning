package pl.java;

import javax.persistence.Embeddable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Addres;
import domain.Employee;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
	
		Employee employee = new Employee();
		Addres addres = new Addres();
		employee.setFirstName("Tomasz");
		employee.setLastName("Nokowa");
		employee.setSalary(123.23);
		employee.setAddres(addres);
		addres.setLocality("Warszawa");
		addres.setZipCode("23 342");
		addres.setStreet("Kalosze");
		addres.setStreetNumber(342);
		
		
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
	}

}
