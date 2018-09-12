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
import domain.Employe;
import domain.Project;



public class Main {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	
	public static void main(String[] args) {
		entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
		entityManager = entityManagerFactory.createEntityManager();

		Project project1 = new Project();
		Project project2 = new Project();
		project1.setName("First Project");
		project2.setName("Second Project");
		Employe employe1 = new Employe("Ewelina", "Cieœla", 2103.22);
		Employe employe2 = new Employe("Natalia", "Kowalska", 2133.22);
		Employe employe3 = new Employe("Klaudia", "Radomska", 4213.22);
		Employe employe4 = new Employe("Gabriela", "Walow", 2613.22);
		Employe employe5 = new Employe("Magdalena", "Tyniek", 1213.22);
		Employe employe6 = new Employe("¯aneta", "¯epa", 2913.22);
		java.util.List<Employe> employes1 = new ArrayList<>();
		employes1.add(employe6);
		employes1.add(employe5);
		employes1.add(employe4);
		java.util.List<Employe> employes2 = new ArrayList<>();
		employes2.add(employe3);
		employes2.add(employe2);
		employes2.add(employe1);
		
		project1.setEmploye(employes1);
		project2.setEmploye(employes2);
	
		
		entityManager.getTransaction().begin();
		entityManager.persist(project1);
		entityManager.persist(project2);
		entityManager.persist(employe1);
		entityManager.persist(employe2);
		entityManager.persist(employe3);
		entityManager.persist(employe4);
		entityManager.persist(employe5);
		entityManager.persist(employe6);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
	}
	
	
}
