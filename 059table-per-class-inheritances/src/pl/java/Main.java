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
import domain.Professor;
import domain.Student;



public class Main {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	
	public static void main(String[] args) {
		entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
		entityManager = entityManagerFactory.createEntityManager();

		Professor professor = new Professor();
		professor.setFirstname("Bogdan");
		professor.setLastName("Kulczyk");
		professor.setSalary(3245.66);
		
		Student student = new Student();
		student.setFirstname("Patryk");
		student.setLastName("Kaszuba");
		student.setAverageGrade(4.00);
	
		
		entityManager.getTransaction().begin();
		entityManager.persist(student);
		entityManager.persist(professor);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
	}
	
	
}
