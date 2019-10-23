package com.utface.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utface.apirest.models.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
	
	Professor findById(long id);

}