package pl.java;

public class UsersRepositoryImpl implements UsersRepository {
	private Logger logger;
	
	
	public UsersRepositoryImpl(Logger logger, String localization, String dbname) {
		this.logger = logger;
		logger.log("lokalizacja repozytoruim: " + localization + "/" + dbname);
	}

	public User createUser(String name) {
		logger.log("tworzenie urzytkownika" + name);
		return new User(name);
	}

}
