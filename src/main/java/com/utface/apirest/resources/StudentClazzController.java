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

import com.utface.apirest.models.StudentClazz;
import com.utface.apirest.repository.StudentClazzRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "UTFace - REST API")
@CrossOrigin(origins = "*")
public class StudentClazzController {
	@Autowired
	StudentClazzRepository studentClazzRepository;
	
	@GetMapping("/studentclazz")
	@ApiOperation(value = "Returns a list of StudentClass")
	public List<StudentClazz> getAll() {
		return studentClazzRepository.findAll();
	}
	
	@GetMapping("/studentclazz/{id}")
	@ApiOperation(value = "Returns a StudentClass by ID")
	public StudentClazz getById(@PathVariable(value = "id") long id) {
		return studentClazzRepository.findById(id);
	}
	
	@PostMapping("/studentclazz")
	@ApiOperation(value = "Creates a new StudentClass")
	public StudentClazz create(@RequestBody StudentClazz studentClazz) {
		return studentClazzRepository.save(studentClazz);
	}
	
	@PutMapping("/studentclazz")
	@ApiOperation(value = "Updates a StudentClass")
	public StudentClazz update(@RequestBody StudentClazz studentClazz) {
		return studentClazzRepository.save(studentClazz);
	}
	
	@DeleteMapping("/studentclazz")
	@ApiOperation(value = "Deletes a StudentClass")
	public void delete(@RequestBody StudentClazz studentClazz) {
		studentClazzRepository.delete(studentClazz);
	}
}
