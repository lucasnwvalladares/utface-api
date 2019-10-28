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

import com.utface.apirest.models.Course;
import com.utface.apirest.repository.CourseRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "UTFace - REST API")
@CrossOrigin(origins = "*")
public class CourseController {
	@Autowired
	CourseRepository courseRepository;
	
	@GetMapping("/courses")
	@ApiOperation(value = "Returns a list of Courses")
	public List<Course> getAll() {
		return courseRepository.findAll();
	}
	
	@GetMapping("/courses/{id}")
	@ApiOperation(value = "Returns a Course by ID")
	public Course getById(@PathVariable(value = "id") long id) {
		return courseRepository.findById(id);
	}
	
	@PostMapping("/courses")
	@ApiOperation(value = "Creates a new Course")
	public Course create(@RequestBody Course course) {
		return courseRepository.save(course);
	}
	
	@PutMapping("/courses")
	@ApiOperation(value = "Updates a Course")
	public Course update(@RequestBody Course course) {
		return courseRepository.save(course);
	}
	
	@DeleteMapping("/courses")
	@ApiOperation(value = "Deletes a Course")
	public void delete(@RequestBody Course course) {
		courseRepository.delete(course);
	}
}
