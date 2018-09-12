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
import domain.Doctor;
import domain.Patient;



public class Main {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	
	public static void main(String[] args) {
		entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
		entityManager = entityManagerFactory.createEntityManager();
		
		Patient patient = new Patient();
		patient.setName("Beata");
		patient.setSurname("Kulczyk");
		patient.setAge(49);
		patient.setGender("women");
		patient.setDisease("headache");
		patient.setNumberInQueue(287);
		
		Doctor doctor = new Doctor();
		doctor.setName("Jolanta");
		doctor.setSurname("Korzuch");
		doctor.setAge(45);
		doctor.setSalary(4289.10);
		
		entityManager.getTransaction().begin();
		entityManager.persist(patient);
		entityManager.persist(doctor);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
	}
	
	
}
