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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.utface.apirest.models.User;
import com.utface.apirest.repository.UserRepository;

@RestController
@RequestMapping(value = "/api")
public class UserController {
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/users")
	public List<User> getAll() {
		return userRepository.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User getById(@PathVariable(value = "id") long id) {
		return userRepository.findById(id);
	}
	
	@GetMapping("/users/{userrole}")
	public List<User> getByRole(@RequestParam(value = "userrole") String userrole) {
		return userRepository.findByRole(userrole);
	}
	
	@PostMapping("/users")
	public User create(@RequestBody User newuser) {
		return userRepository.save(newuser);
	}
	
	@PutMapping("/users")
	public User update(@RequestBody User upduser) {
		return userRepository.save(upduser);
	}
	
	@DeleteMapping("/users")
	public void delete(@RequestBody User deluser) {
		userRepository.delete(deluser);
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteById(@PathVariable(value = "id") long id) {
		userRepository.deleteById(id);
	}
}
