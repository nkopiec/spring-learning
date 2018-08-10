package pl.java;

import java.util.logging.Logger;

public class UsersRepositories {
	private Logger logger;
	
	public User creteUser(String name) {
		logger.log(null, "Made User" + name);;
		return new User();
	}
	
	public void setLogger(Logger logger) {
		this.logger = logger;
	}
}
