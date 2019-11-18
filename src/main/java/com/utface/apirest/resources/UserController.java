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

import com.utface.apirest.models.User;
import com.utface.apirest.repository.UserRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "UTFace - REST API")
@CrossOrigin(origins = "*")
public class UserController {
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/users")
	@ApiOperation(value = "Returns a list of Users")
	public List<User> getAll() {
		return userRepository.findAll();
	}
	
	@GetMapping("/users/{id}")
	@ApiOperation(value = "Returns a User by ID")
	public User getById(@PathVariable(value = "id") long id) {
		return userRepository.findById(id);
	}
	
	/**
	 * @GetMapping("/users/{userrole}")
	 * @ApiOperation(value = "Returns a User by Role")
	 * public List<User> getByRole(@RequestParam(value = "userrole") String userrole) {
	 * 		return userRepository.findByRole(userrole);
	 * }
	*/
	
	@PostMapping("/users")
	@ApiOperation(value = "Creates a new User")
	public User create(@RequestBody User newuser) {
		return userRepository.save(newuser);
	}
	
	@PutMapping("/users")
	@ApiOperation(value = "Updates a User")
	public User update(@RequestBody User upduser) {
		return userRepository.save(upduser);
	}
	
	@DeleteMapping("/users")
	@ApiOperation(value = "Deletes a User")
	public void delete(@RequestBody User deluser) {
		userRepository.delete(deluser);
	}
	
	@DeleteMapping("/users/{id}")
	@ApiOperation(value = "Deletes a User by ID")
	public void deleteById(@PathVariable(value = "id") long id) {
		userRepository.deleteById(id);
	}
}
