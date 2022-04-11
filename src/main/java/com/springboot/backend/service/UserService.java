package com.springboot.backend.service;

import java.util.List;

import com.springboot.backend.model.User;

public interface UserService {
	User saveUser(User user);
	List<User> getAllUsers();
}
