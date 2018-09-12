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
		TypedQuery<EmployeI> query = entityManager.createQuery("select e from Pracownik e where e.lastName in :names", EmployeI.class);
		java.util.List<String> names = new ArrayList<>();
		names.add("Jêdzejczak");
		names.add("Kurowski");
		query.setParameter("names", names);
		for (EmployeI employeI : query.getResultList()) {
			System.out.println(employeI.getFirstName());
			System.out.println(employeI.getLastName());
			System.out.println(employeI.getSalary());			
		}

		entityManager.close();
		entityManagerFactory.close();
	}
	
	private static void addEmployes() {
		addEmployes("Stefan", "Kurowski", 1235.66);
		addEmployes("Emilia", "Jêdzejczak", 3424.66);
		addEmployes("W³adys³aw", "Jaszczur", 2466.33);
		addEmployes("Tomasz", "Piotrowski", 3567.55);
		addEmployes("Natalia", "Nowak", 6434.23);
		addEmployes("Katarzyna", "Kania", 4524.33 );
		addEmployes("¯aneta", "Wozniak", 4352.66);
		addEmployes("Rafa³", "Jurkowski", 9753.33);
		addEmployes("Krystian", "Pudian", 8337.33 );
		addEmployes("Krzysztof", "Kurowski", 5432.12);
		
	}
	
	private static void addEmployes(String firstName, String lastName, double salary) {
		EmployeI employeI = new EmployeI();
		employeI.setFirstName(firstName);
		employeI.setLastName(lastName);
		employeI.setSalary(salary);
		
	
		entityManager.getTransaction().begin();
		entityManager.persist(employeI);
		entityManager.getTransaction().commit();
	}

}
