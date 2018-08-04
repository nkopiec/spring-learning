package pl.java;

public class User {
	private String name;
	private Addres addres;
	
	
	public User(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Addres getAddres() {
		return addres;
	}
	public void setAddres(Addres addres) {
		this.addres = addres;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", addres=" + addres + "]";
	}
	
	
	
}
