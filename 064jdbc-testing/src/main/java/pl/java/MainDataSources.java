package pl.java;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class MainDataSources {
	private static final String DATABASE_NAME = "mojabaza";
	private static final String SERVER_NAME = "localhost";
	private static final String USER = "tutorial";
	private static final String PASSWORD = "password";

	public static void main(String[] args) throws SQLException {
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setDatabaseName(DATABASE_NAME);
		dataSource.setServerName(SERVER_NAME);
		dataSource.setUser(USER);
		dataSource.setPassword(PASSWORD);
		
		Connection connection = dataSource.getConnection();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM doctor");
		
		while (resultSet.next()) {
			String name = resultSet.getString("name");
			int age = resultSet.getInt("age");
			
			System.out.println(name + age);
		}
	}
}
