package com.utface.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utface.apirest.models.StudentClazz;

public interface StudentClazzRepository extends JpaRepository<StudentClazz, Long> {
	StudentClazz findById(long id);
}
