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
		employee.setFirstName("Jan");
		employee.setLastName("Podolski");
		employee.setSalary(2006.5);
		
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		
		System.out.println("First name:" + employee.getFirstName());
		System.out.println("Surname:" + employee.getLastName());
		System.out.println("Salary: " + employee.getSalary());
		System.out.println("Tax: " + employee.getTax());
		
		entityManager.refresh(employee);
		
		System.out.println("First name:" + employee.getFirstName());
		System.out.println("Surname:" + employee.getLastName());
		System.out.println("Salary: " + employee.getSalary());
		System.out.println("Tax: " + employee.getTax());
		
		entityManager.close();
		entityManagerFactory.close();
	}

}
