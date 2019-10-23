package com.utface.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.utface.apirest.models.Course;
import com.utface.apirest.repository.CourseRepository;

public class CourseController {
	@Autowired
	CourseRepository courseRepository;
	
	@GetMapping("/courses")
	public List<Course> getAll() {
		return courseRepository.findAll();
	}
	
	@GetMapping("/courses/{id}")
	public Course getById(@PathVariable(value = "id") long id) {
		return courseRepository.findById(id);
	}
	
	@PostMapping("/courses")
	public Course create(@RequestBody Course course) {
		return courseRepository.save(course);
	}
	
	@PutMapping("/courses")
	public Course update(@RequestBody Course course) {
		return courseRepository.save(course);
	}
	
	@DeleteMapping("/courses")
	public void delete(@RequestBody Course course) {
		courseRepository.delete(course);
	}
}
