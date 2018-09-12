package pl.java;

public class Application {
	private UsersRepository usersRepository;
	private DictionaryRepositories dictionaryRepositories;
	
	public UsersRepository getUsersRepository() {
		return usersRepository;
	}
	public void setUsersRepository(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}
	public DictionaryRepositories getDictionaryRepositories() {
		return dictionaryRepositories;
	}
	public void setDictionaryRepositories(DictionaryRepositories dictionaryRepositories) {
		this.dictionaryRepositories = dictionaryRepositories;
	}
	
	

}
