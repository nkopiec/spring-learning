package pl.java;

public interface UsersRepository {
	User createUser(String name);
	void setLogger(Logger logger);
}
