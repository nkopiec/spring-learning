package pl.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("usersRepository")
public class UsersRepositoryImpl implements UsersRepository {
	@Autowired
	@Qualifier("withDateLoggerXmlQualifier")
	private Logger logger;
	
	
	public User createUser(String name) {
		logger.log("tworzenie urzytkownika" + name);
		return new User(name);
	}

	public void setLogger(Logger logger) {
		this.logger = logger;

	}

}
