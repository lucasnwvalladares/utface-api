package com.utface.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utface.apirest.models.Role;
import com.utface.apirest.repository.RoleRepository;

@RestController
@RequestMapping(value="/api")
public class RoleController {
	@Autowired
	RoleRepository roleRepository;
	
	@GetMapping("/roles")
	public List<Role> getAll() {
		return roleRepository.findAll();
	}
	
	@GetMapping("/roles/{id}")
	public Role getRoleById(@PathVariable(value = "id") long id) {
		return roleRepository.findById(id);
	}
	
	@PostMapping("/roles")
	public Role create(@RequestBody Role newrole) {
		return roleRepository.save(newrole);
	}
	
	@PutMapping("/roles")
	public Role update(@RequestBody Role updrole) {
		return roleRepository.save(updrole);
	}
	
	@DeleteMapping("/roles")
	public void remove(@RequestBody Role delrole) {
		roleRepository.delete(delrole);
	}
}
