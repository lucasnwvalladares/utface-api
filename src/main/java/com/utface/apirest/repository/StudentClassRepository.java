package com.utface.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utface.apirest.models.StudentClass;

public interface StudentClassRepository extends JpaRepository<StudentClass, Long> {
	StudentClass findById(long id);
}
