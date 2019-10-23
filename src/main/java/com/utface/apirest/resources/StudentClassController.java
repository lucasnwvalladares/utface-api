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

import com.utface.apirest.models.StudentClass;
import com.utface.apirest.repository.StudentClassRepository;

@RestController
@RequestMapping(value = "/api")
public class StudentClassController {
	@Autowired
	StudentClassRepository studentClassRepository;
	
	@GetMapping("/studentclass")
	public List<StudentClass> getAll() {
		return studentClassRepository.findAll();
	}
	
	@GetMapping("/studentclass/{id}")
	public StudentClass getById(@PathVariable(value = "id") long id) {
		return studentClassRepository.findById(id);
	}
	
	@PostMapping("/studentclass")
	public StudentClass create(@RequestBody StudentClass studentClass) {
		return studentClassRepository.save(studentClass);
	}
	
	@PutMapping("/studentclass")
	public StudentClass update(@RequestBody StudentClass studentClass) {
		return studentClassRepository.save(studentClass);
	}
	
	@DeleteMapping("/studentclass")
	public void delete(@RequestBody StudentClass studentClass) {
		studentClassRepository.delete(studentClass);
	}
}
