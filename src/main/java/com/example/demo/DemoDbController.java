package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoDbController {
	
	private static final Logger log = LoggerFactory.getLogger(DemoDbController.class);

	@Autowired
	private DemoDbService demoDbService;

	@GetMapping("/users")
	public Iterable<DemoDbUser> getAllusers() {
		log.info("Start get users..........");
		return demoDbService.getAllUsers();
	}

	@GetMapping("/user/{username}")
	public DemoDbUser getUserByUsername(@PathVariable(name = "username") String username) {
		return demoDbService.getUserByUsername(username);
	}

}
