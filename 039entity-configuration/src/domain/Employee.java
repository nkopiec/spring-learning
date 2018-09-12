package domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Staff")
public class Employee {
	@Id
	@GeneratedValue
	private long id;
	@Column(name = "Name", nullable = false, length = 10)
	private String firstname;
	@Column(name = "Surname", columnDefinition = "VARCHAR(10) NOT NULL")
	private String lastName;
	@Column(name = "Salary")
	private double salary;
	@Column(name = "Bonus", precision = 10, scale = 2)
	private BigDecimal salary2;

	public BigDecimal getSalary2() {
		return salary2;
	}

	public void setSalary2(BigDecimal salary2) {
		this.salary2 = salary2;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
