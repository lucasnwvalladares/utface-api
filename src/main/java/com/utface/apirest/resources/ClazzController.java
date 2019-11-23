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
import com.utface.apirest.repository.ClazzRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "UTFace - REST API")
@CrossOrigin(origins = "*")
public class ClazzController {
	@Autowired
	ClazzRepository clazzRepository;
	
	@GetMapping("/clazzes")
	@ApiOperation(value = "Returns a list os Classes")
	public List<Clazz> getAll() {
		return clazzRepository.findAll();
	}
	
	@GetMapping("/clazzes/{discipline_code}")
	@ApiOperation(value = "Returns Class by Discipline Code")
	public List<Clazz> getByDisciplineCode(@PathVariable(value = "discipline_code") String disciplineCode) {
		return clazzRepository.findByDisciplineCode(disciplineCode);
	}
	
	@PostMapping("/clazzes")
	@ApiOperation(value = "Creates a new Class")
	public Clazz create(@RequestBody Clazz clazz) {
		return clazzRepository.save(clazz);
	}
	
	@PutMapping("/clazzes")
	@ApiOperation(value = "Updates a Class")
	public Clazz update(@RequestBody Clazz clazz) {
		return clazzRepository.save(clazz);
	}
	
	@DeleteMapping("/clazzes")
	@ApiOperation(value = "Deletes a Class")
	public void delete(@RequestBody Clazz clazz) {
		clazzRepository.delete(clazz);
	}
}
