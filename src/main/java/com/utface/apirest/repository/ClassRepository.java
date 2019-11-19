package com.utface.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utface.apirest.models.ClassX;

public interface ClassRepository extends JpaRepository<ClassX, String> {
	
	List<ClassX> findByDisciplineCode(String discipline_code);

}