package domain;

import javax.persistence.Entity;

@Entity
public class Patient extends Person{
	public String gender;
	public String disease;
	public int numberInQueue;
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public int getNumberInQueue() {
		return numberInQueue;
	}
	public void setNumberInQueue(int numberInQueue) {
		this.numberInQueue = numberInQueue;
	}
	
	

}
