package com.jordan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jordan.model.Users;

@Repository("UsersRepository")
public interface UsersRepository extends JpaRepository<Users, Integer>{

	<S extends Users> S save(Users user);
	
	Users findByUsernameAndPassword(String username, String password);
}
