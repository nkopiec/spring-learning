package pl.java;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
	//	ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		EmployeeRepository employeeRepository = context.getBean("employeeRepository", EmployeeRepository.class);
		int numberOfEmployee = employeeRepository.getNumberOfEmployee();
		System.out.println("Number of employee: " + numberOfEmployee);
	
		double numberOfSalary = employeeRepository.getNumberOfSalary(3000.00);
		System.out.println("Number of salary: " + numberOfSalary);
	
		Map<String, Object> employei = employeeRepository.getSumOfSalary("Stefan");
		System.out.println("Number of salary: " + employei);
	
		List<Map<String, Object>> employeeWithSalaryThan = employeeRepository.getEmployeeWithSalaryThan(2000.00);
		for (Map<String, Object> employeeMap :  employeeWithSalaryThan) {
			System.out.println(employeeMap);
			
		double average = employeeRepository.getEmployeeSalary().stream()
				.mapToDouble(Double::doubleValue)
				.average()
				.getAsDouble();
		
		System.out.println(average);
		
		EmployeIRepository employeIRepository = context.getBean("employeIRepository", EmployeIRepository.class);
		EmployeI employeI1 = employeIRepository.getEmployeIById("1");
		System.out.println(employeI1);
		
		List<EmployeI> allEmployeI = employeIRepository.getAllEmployeI();
		for (EmployeI employeI2 : allEmployeI) {
			System.out.println(employeI2);
		}
		
		List<Map<String, Object>> salaryHight = employeIRepository.getSalaryHight(1000.00, 6000.00);
		for (Map<String, Object> salary : salaryHight) {
			System.out.println(salary);
		}
		
		List<String> pprofesion = Collections.singletonList("Chef");
		List<Map<String, Object>> profesions = employeIRepository.getProfesion(pprofesion);
		for (Map<String, Object> profesion : profesions) {
			System.out.println(profesion);
		}
		}
	}

}
