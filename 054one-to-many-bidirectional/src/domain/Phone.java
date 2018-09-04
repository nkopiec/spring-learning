package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Phone {
	@Id
	@GeneratedValue
	private long id;
	
	private String type;
	private String number;
	@ManyToOne
	@JoinColumn(name = "owner_id")
	private Employe2 employe2;
	
	public Employe2 getEmploye2() {
		return employe2;
	}
	public void setEmploye2(Employe2 employe2) {
		this.employe2 = employe2;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	
}
