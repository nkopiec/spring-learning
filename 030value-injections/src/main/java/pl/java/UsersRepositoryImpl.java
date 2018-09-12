 package pl.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import javax.annotation.*;
@Service("usersRepository")
public class UsersRepositoryImpl implements UsersRepository {
	@Autowired(required = false)
	private Logger logger;
	
	@Value("${database.host}")
	private String host;
	@Value("${database.port}")
	private int port;
	@Value("${database.name}")
	private String database;
	@Value("#{systemProperties['database.user']}")
	private String user;
	@Value("#{systemProperties['database.password']}")
	private String password;
	
	
	public User createUser(String name) {
		if (logger != null) {
			logger.log("tworzenie urzytkownika" + name + " do bazy " + host +
					" : " + port + " / " + database  + " korzystajac z urzytkowanika " + user + " i has³a " + password);
		}
		return new User(name);
	}

	public void setLogger(Logger logger) {
		this.logger = logger;

	}

}
