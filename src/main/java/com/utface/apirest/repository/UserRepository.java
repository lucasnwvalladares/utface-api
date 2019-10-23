package com.utface.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utface.apirest.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findById(long id);
	List<User> findByRole(String userrole);
}
