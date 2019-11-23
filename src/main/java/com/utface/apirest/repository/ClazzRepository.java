package com.utface.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utface.apirest.models.Clazz;

public interface ClazzRepository extends JpaRepository<Clazz, String> {
	
	List<Clazz> findByDisciplineCode(String discipline_code);

}