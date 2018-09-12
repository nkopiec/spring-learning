package pl.java;

public class User {
	private String name;
	private int age;
	
	private User() {
	}
	
	public static User getInstance(String name, int age) {
		User user = new User();
		user.age = age;
		user.name = name;
		return user;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
}
