package com.jesse04.case22.application;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jesse04.case22.libary.service.Service;
import com.jesse04.case22.libary.service.ServiceConfiguration;

@SpringBootApplication
@Import(ServiceConfiguration.class)
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	private final Service service;

	@Autowired
	public Application(Service service) {
		this.service = service;
	}

	@GetMapping("/")
	public String home() {
		return service.message();
	}
}
