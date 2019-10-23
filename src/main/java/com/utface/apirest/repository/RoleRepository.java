package com.utface.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utface.apirest.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	
	Role findById(long id);

}
