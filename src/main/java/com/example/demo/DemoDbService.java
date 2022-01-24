package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoDbService {

	@Autowired
	private DemoDbRepository demoDbRepository;

	public Iterable<DemoDbUser> getAllUsers() {
		return demoDbRepository.findAll();
	}

	public DemoDbUser getUserByUsername(String username) {
		return demoDbRepository.findByUsername(username);
	}
	
}
