package com.utface.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "UTFace - REST API")
@CrossOrigin(origins = "*")
public class RoleController {
	@Autowired
	RoleRepository roleRepository;
	
	@GetMapping("/roles")
	@ApiOperation(value = "Returns a list of Roles")
	public List<Role> getAll() {
		return roleRepository.findAll();
	}
	
	@GetMapping("/roles/{id}")
	@ApiOperation(value = "Returns a Role by ID")
	public Role getRoleById(@PathVariable(value = "id") long id) {
		return roleRepository.findById(id);
	}
	
	@PostMapping("/roles")
	@ApiOperation(value = "Creates a new Role")
	public Role create(@RequestBody Role newrole) {
		return roleRepository.save(newrole);
	}
	
	@PutMapping("/roles")
	@ApiOperation(value = "Updates a Role")
	public Role update(@RequestBody Role updrole) {
		return roleRepository.save(updrole);
	}
	
	@DeleteMapping("/roles")
	@ApiOperation(value = "Deletes a Role")
	public void remove(@RequestBody Role delrole) {
		roleRepository.delete(delrole);
	}
}
