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

import com.utface.apirest.models.StudentClass;
import com.utface.apirest.repository.StudentClassRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "UTFace - REST API")
@CrossOrigin(origins = "*")
public class StudentClassController {
	@Autowired
	StudentClassRepository studentClassRepository;
	
	@GetMapping("/studentclass")
	@ApiOperation(value = "Returns a list of StudentClass")
	public List<StudentClass> getAll() {
		return studentClassRepository.findAll();
	}
	
	@GetMapping("/studentclass/{id}")
	@ApiOperation(value = "Returns a StudentClass by ID")
	public StudentClass getById(@PathVariable(value = "id") long id) {
		return studentClassRepository.findById(id);
	}
	
	@PostMapping("/studentclass")
	@ApiOperation(value = "Creates a new StudentClass")
	public StudentClass create(@RequestBody StudentClass studentClass) {
		return studentClassRepository.save(studentClass);
	}
	
	@PutMapping("/studentclass")
	@ApiOperation(value = "Updates a StudentClass")
	public StudentClass update(@RequestBody StudentClass studentClass) {
		return studentClassRepository.save(studentClass);
	}
	
	@DeleteMapping("/studentclass")
	@ApiOperation(value = "Deletes a StudentClass")
	public void delete(@RequestBody StudentClass studentClass) {
		studentClassRepository.delete(studentClass);
	}
}
