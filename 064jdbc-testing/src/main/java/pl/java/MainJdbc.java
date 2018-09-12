package pl.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainJdbc {
	public static final String URL = "jdbc:mysql://localhost:3306/mojabaza";
	public static final String USER = "tutorial";
	public static final String PASSWORD = "password";
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM doctor");
			while (resultSet.next()) {
				String name = resultSet.getString("name");
				int age = resultSet.getInt("age");
				
				System.out.println(name + age);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}