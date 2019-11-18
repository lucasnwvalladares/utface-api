package com.utface.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utface.apirest.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findById(long id);
	
}
