package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
public class DemoDbApplication { 
	
	
	private static final Logger log = LoggerFactory.getLogger(DemoDbApplication.class);


	public static void main(String[] args) {
		log.info("#################### START APPLICATION ####################");
		SpringApplication.run(DemoDbApplication.class, args);
		log.info("#################### APPLICATION STARTED ####################");
	}

}
