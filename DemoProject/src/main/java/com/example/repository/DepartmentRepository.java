package com.example.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

	@Query(value = "select * from department where is_lead = 1", nativeQuery = true)
	Department findAByLead();
	
	@Query(value = "select count(*) from department where employee_position = 'assistance'", nativeQuery = true)
	Department countOfAssistance();
	
	@Query(value = "select count(*) from department where employee_position = 'professor'", nativeQuery = true)
	Department countOfProfessor();
	
	@Query(value = "select count(*) from department where employee_position = 'associate_professor'", nativeQuery = true)
	Department countOfAssociateProfessor();
}