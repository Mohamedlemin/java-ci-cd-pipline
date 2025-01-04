package com.msservice.cicdtest.users;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<Job> getUsers() {
		return userRepository.findAll();
	}
}
