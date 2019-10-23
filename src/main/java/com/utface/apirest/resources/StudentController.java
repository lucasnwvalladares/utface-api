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

import com.utface.apirest.models.Student;
import com.utface.apirest.repository.StudentRepository;

@RestController
@RequestMapping(value = "/api")
public class StudentController {
	@Autowired
	StudentRepository studentRepository;
	
	@GetMapping("/students")
	public List<Student> getAll() {
		return studentRepository.findAll();
	}
	
	@GetMapping("/students/{id}")
	public Student getById(@PathVariable(value = "id") long id) {
		return studentRepository.findById(id);
	}
	
	@PostMapping("/students")
	public Student create(@RequestBody Student student) {
		return studentRepository.save(student);
	}
	
	@PutMapping("/students")
	public Student update(@RequestBody Student student) {
		return studentRepository.save(student);
	}
	
	@DeleteMapping("/students")
	public void delete(@RequestBody Student student) {
		studentRepository.delete(student);
	}
}
