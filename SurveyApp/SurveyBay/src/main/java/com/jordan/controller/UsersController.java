package com.jordan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jordan.model.Users;
import com.jordan.service.UsersService;


@CrossOrigin
@RestController("usersController")
@RequestMapping(path="/user")
public class UsersController {
	
	@Autowired
	private UsersService uServ;

	@PostMapping(path = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveUser(@RequestBody Users user) {
		this.uServ.saveUser(user);
	}
	
	@PostMapping(path="/login", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Users login(@RequestBody Users u) {
		u = this.uServ.login(u.getUsername(), u.getPassword());
		u.setPassword(null);
		return u;
	}
}
