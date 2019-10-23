package com.utface.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utface.apirest.models.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
	Student findById(long id);

}