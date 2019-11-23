package com.utface.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utface.apirest.models.Presence;

public interface PresenceRepository extends JpaRepository<Presence, String> {
	List<Presence> findByStudentCode(String student_code);
}
