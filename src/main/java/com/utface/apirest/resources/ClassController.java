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

import com.utface.apirest.models.ClassX;
import com.utface.apirest.repository.ClassRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "UTFace - REST API")
@CrossOrigin(origins = "*")
public class ClassController {
	@Autowired
	ClassRepository classRepository;
	
	@GetMapping("/classes")
	@ApiOperation(value = "Returns a list os Classes")
	public List<ClassX> getAll() {
		return classRepository.findAll();
	}
	
	@GetMapping("/classes/{id}")
	@ApiOperation(value = "Returns Class by ID")
	public ClassX getById(@PathVariable(value = "id") long id) {
		return classRepository.findById(id);
	}
	
	@PostMapping("/classes")
	@ApiOperation(value = "Creates a new Class")
	public ClassX create(@RequestBody ClassX classX) {
		return classRepository.save(classX);
	}
	
	@PutMapping("/classes")
	@ApiOperation(value = "Updates a Class")
	public ClassX update(@RequestBody ClassX classX) {
		return classRepository.save(classX);
	}
	
	@DeleteMapping("/classes")
	@ApiOperation(value = "Deletes a Class")
	public void delete(@RequestBody ClassX classX) {
		classRepository.delete(classX);
	}
}
