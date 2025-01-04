package com.msservice.cicdtest.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello from the Demo App!";
	}

	@GetMapping
	public List<Job> getUsers() {
		return userService.getUsers();

	}
}
