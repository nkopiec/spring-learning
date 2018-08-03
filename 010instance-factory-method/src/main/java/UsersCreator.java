import java.util.logging.Logger;

public class UsersCreator {
	Logger logger = Logger.getLogger(this.getClass().getName());
	
	public User createUser(String userName) {
		logger.info("Tworzenie uzytkowanika" + userName);
		User user = new User();
		user.setName(userName);
		return user;
	}
}
