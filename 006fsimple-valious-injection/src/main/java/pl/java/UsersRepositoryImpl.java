package pl.java;

public class UsersRepositoryImpl implements UsersRepository {
	private Logger logger;
	
	public User createUser(String name) {
		logger.log("tworzenie urzytkownika" + name);
		return new User(name);
	}

	public void setLogger(Logger logger) {
		this.logger = logger;

	}

}
