package com.springboot.backend.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.backend.model.User;
import com.springboot.backend.repository.UserRepository;
import com.springboot.backend.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User saveUser(User user) {

		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

}
