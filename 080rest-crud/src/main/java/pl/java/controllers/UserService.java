package pl.java.controllers;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	private long id;
	

	public List<User> findAllUsers() {
		return null;
	}

	public User findById(long id) {
		return null;
	}

	public boolean isUserExist(User user) {
		return false;
	}

	public void saveUser(User user) {
		
	}

	public void updateUser(User currentUser) {
		
	}

	public void deleteUserById(long id) {
		this.id = id;
	}

	public void deleteAllUsers() {
		
	}

}
