package pl.java;

public class Main {

	public static void main(String[] args) {
		Logger logger = new LogerImpl();
		UsersRepository usersRepository = new UsersRepositoryImpl();
		usersRepository.setLogger(logger);
		
		
		usersRepository.createUser(" Kowalski");

	}

}
