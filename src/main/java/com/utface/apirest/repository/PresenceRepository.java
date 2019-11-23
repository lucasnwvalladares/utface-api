package com.utface.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utface.apirest.models.Presence;

public interface PresenceRepository extends JpaRepository<Presence, String> {
	Presence findByStudentCode(String student_code);
	Presence findByClazzId(String clazz_id);
}
