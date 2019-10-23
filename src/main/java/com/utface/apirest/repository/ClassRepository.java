package com.utface.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utface.apirest.models.ClassX;

public interface ClassRepository extends JpaRepository<ClassX, Long> {
	
	ClassX findById(long id);

}