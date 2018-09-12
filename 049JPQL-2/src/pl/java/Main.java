package pl.java;

import java.util.ArrayList;
import java.util.Iterator;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import antlr.collections.List;
import domain.EmployeI;

public class Main {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	
	public static void main(String[] args) {
		entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
		entityManager = entityManagerFactory.createEntityManager();

		addEmployes();
		TypedQuery<EmployeI> query = entityManager.createQuery("select e from EmployeI e where e.lastName in :names", EmployeI.class);
		java.util.List<String> names = new ArrayList<>();
		names.add("Jêdzejczak");
		names.add("Kurowski");
		query.setParameter("names", names);
		for (EmployeI employeI : query.getResultList()) {
			System.out.println(employeI.getFirstName());
			System.out.println(employeI.getLastName());
			System.out.println(employeI.getSalary());			
			System.out.println(employeI.getProfesion());			
		}

		entityManager.close();
		entityManagerFactory.close();
	}
	
	private static void addEmployes() {
		addEmployes("Stefan", "Kurowski", 1235.66, "Chef");
		addEmployes("Emilia", "Jêdzejczak", 3424.66, "Waiter");
		addEmployes("W³adys³aw", "Jaszczur", 2466.33, "Chef");
		addEmployes("Tomasz", "Piotrowski", 3567.55, "Waiter");
		addEmployes("Natalia", "Nowak", 6434.23, "Waiter");
		addEmployes("Katarzyna", "Kania", 4524.33, "Driver");
		addEmployes("¯aneta", "Wozniak", 4352.66, "Chef");
		addEmployes("Rafa³", "Jurkowski", 9753.33, "Driver");
		addEmployes("Krystian", "Pudian", 8337.33, "Chef");
		addEmployes("Krzysztof", "Kurowski", 5432.12, "Driver");
		
	}
	
	private static void addEmployes(String firstName, String lastName, double salary, String profesion) {
		EmployeI employeI = new EmployeI();
		employeI.setFirstName(firstName);
		employeI.setLastName(lastName);
		employeI.setSalary(salary);
		employeI.setProfesion(profesion);;
		
	
		entityManager.getTransaction().begin();
		entityManager.persist(employeI);
		entityManager.getTransaction().commit();
	}

}
