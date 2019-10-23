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

import com.utface.apirest.models.ClassX;
import com.utface.apirest.repository.ClassRepository;

@RestController
@RequestMapping(value = "/api")
public class ClassController {
	@Autowired
	ClassRepository classRepository;
	
	@GetMapping("/classes")
	public List<ClassX> getAll() {
		return classRepository.findAll();
	}
	
	@GetMapping("/classes/{id}")
	public ClassX getById(@PathVariable(value = "id") long id) {
		return classRepository.findById(id);
	}
	
	@PostMapping("/classes")
	public ClassX create(@RequestBody ClassX classX) {
		return classRepository.save(classX);
	}
	
	@PutMapping("/classes")
	public ClassX update(@RequestBody ClassX classX) {
		return classRepository.save(classX);
	}
	
	@DeleteMapping("/classes")
	public void delete(@RequestBody ClassX classX) {
		classRepository.delete(classX);
	}
}
