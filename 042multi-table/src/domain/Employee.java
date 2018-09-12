package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "Employees")
@SecondaryTable(name = "Adress", pkJoinColumns = @PrimaryKeyJoinColumn(name = "EmployeeId"))
public class Employee {
	@Id
	@GeneratedValue
	private long id;
	
	@Column(name = "Name")
	private String firstName;
	@Column(name = "Surname")
	private String lastName;
	@Column(name = "Salary")
	private double salary;

	@Column(table = "Adress", name = "Locality")
	private String locality;
	@Column(table = "Adress", name = "Code")
	private String zipCode;
	@Column(table = "Adress", name = "Streed")
	private String street;
	@Column(table = "Adress", name = "Number")
	private int streetNumber;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
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

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

}
