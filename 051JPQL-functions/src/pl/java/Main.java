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
		
//		javax.persistence.Query query = entityManager.createQuery("select avg(e.salary), min(e.salary), max(e.salary), sum(e.salary), count(e) from EmployeI e");
//		Object[] result = (Object[]) query.getSingleResult();
//		System.out.println("Œrednia " + result[0]);
//		System.out.println("Najnizsza " + result[1]);
//		System.out.println("Najwy¿sza " + result[2]);
//		System.out.println("Suma " + result[3]);
//		System.out.println("Pracownicy " + result[4]);
		javax.persistence.Query query = entityManager.createQuery("select substring(e.firstName, 1, 3), trim(e.lastName), lower(e.firstName), upper(e.firstName), length(e.firstName) from EmployeI e where e.firstName = 'Stefan'");
		Object[] result = (Object[]) query.getSingleResult();
		System.out.println("Pierwsze trzy litery imienia: " + result[0]);
		System.out.println("Nazwisko:" + result[1]);
		System.out.println("Imie ma³ymi literami: " + result[2]);
		System.out.println("Imie wielkimi literami: " + result[3]);
		System.out.println("D³ugoœc imienia: " + result[4]);
		System.out.println();
		
		entityManager.close();
		entityManagerFactory.close();
	}
	
	private static void addEmployes() {
		addEmployes("Stefan", " Kurowski ", 1235.66);
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
