package domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class Student extends Person {
	private double averageGrade;

	public double getAverageGrade() {
		return averageGrade;
	}

	public void setAverageGrade(double averageGrade) {
		this.averageGrade = averageGrade;
	}
	
	
}
