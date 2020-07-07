package com.jordan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jordan.model.Users;
import com.jordan.repository.UsersRepository;


@Service("usersService")
public class UsersService {

	@Autowired
	private UsersRepository uRepo;
	
	public void saveUser(Users user) {
		this.uRepo.save(user);
	}
	
	public Users login(String username, String password) {
		return this.uRepo.findByUsernameAndPassword(username, password);
	}
}
