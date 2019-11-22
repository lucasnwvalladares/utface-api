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

import com.utface.apirest.models.Clazz;
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
	public List<Clazz> getAll() {
		return classRepository.findAll();
	}
	
	@GetMapping("/classes/{discipline_code}")
	@ApiOperation(value = "Returns Class by Discipline Code")
	public List<Clazz> getByDisciplineCode(@PathVariable(value = "discipline_code") String disciplineCode) {
		return classRepository.findByDisciplineCode(disciplineCode);
	}
	
	@PostMapping("/classes")
	@ApiOperation(value = "Creates a new Class")
	public Clazz create(@RequestBody Clazz clazz) {
		return classRepository.save(clazz);
	}
	
	@PutMapping("/classes")
	@ApiOperation(value = "Updates a Class")
	public Clazz update(@RequestBody Clazz clazz) {
		return classRepository.save(clazz);
	}
	
	@DeleteMapping("/classes")
	@ApiOperation(value = "Deletes a Class")
	public void delete(@RequestBody Clazz clazz) {
		classRepository.delete(clazz);
	}
}
