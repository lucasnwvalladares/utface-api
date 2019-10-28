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

import com.utface.apirest.models.Student;
import com.utface.apirest.repository.StudentRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "UTFace - REST API")
@CrossOrigin(origins = "*")
public class StudentController {
	@Autowired
	StudentRepository studentRepository;
	
	@GetMapping("/students")
	@ApiOperation(value = "Returns a list of Students")
	public List<Student> getAll() {
		return studentRepository.findAll();
	}
	
	@GetMapping("/students/{id}")
	@ApiOperation(value = "Returns a Student by ID")
	public Student getById(@PathVariable(value = "id") long id) {
		return studentRepository.findById(id);
	}
	
	@PostMapping("/students")
	@ApiOperation(value = "Creates a new Student")
	public Student create(@RequestBody Student student) {
		return studentRepository.save(student);
	}
	
	@PutMapping("/students")
	@ApiOperation(value = "Updates a Student")
	public Student update(@RequestBody Student student) {
		return studentRepository.save(student);
	}
	
	@DeleteMapping("/students")
	@ApiOperation(value = "Deletes a Student")
	public void delete(@RequestBody Student student) {
		studentRepository.delete(student);
	}
}
