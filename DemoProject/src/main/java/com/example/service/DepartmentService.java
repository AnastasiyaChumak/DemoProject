package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository repo;

	public String findByLead() {
		String line = "Head of dep1 department is " + repo.findAByLead();
		return line;
	}

	public String countOfAssistance() {
		return "assistances - " + repo.countOfAssistance();
	}

	public String countOfProfessor() {
		return "professors - " + repo.countOfProfessor();
	}

	public String countOfAssociateProfessor() {
		return "associate professors - " + repo.countOfAssociateProfessor();
	}
}
