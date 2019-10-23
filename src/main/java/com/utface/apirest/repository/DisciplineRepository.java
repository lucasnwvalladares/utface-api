package com.utface.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utface.apirest.models.Discipline;

public interface DisciplineRepository extends JpaRepository<Discipline, Long> {
	
	Discipline findById(long id);

}