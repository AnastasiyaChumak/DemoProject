package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.Banner;

import com.example.service.DepartmentService;

@SpringBootApplication
public class DemoProjectApplication implements CommandLineRunner {

	@Autowired
	private DepartmentService service;
	
	public static void main(String[] args) {
		//SpringApplication.run(DemoProjectApplication.class, args);
		
		SpringApplication app = new SpringApplication(DemoProjectApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(service.findByLead().toString());
		System.out.println(service.countOfAssistance());
		System.out.println(service.countOfAssociateProfessor());
		System.out.println(service.countOfAssistance());
		System.out.println(service.countOfProfessor());
		
	}
	

 
}
