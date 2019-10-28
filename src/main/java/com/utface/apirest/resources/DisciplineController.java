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

import com.utface.apirest.models.Discipline;
import com.utface.apirest.repository.DisciplineRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "UTFace - REST API")
@CrossOrigin(origins = "*")
public class DisciplineController {
	@Autowired
	DisciplineRepository disciplineRepository;
	
	@GetMapping("/disciplines")
	@ApiOperation(value = "Returns a list of Disciplines")
	public List<Discipline> getAll() {
		return disciplineRepository.findAll();
	}
	
	@GetMapping("/disciplines/{id}")
	@ApiOperation(value = "Returns a Discipline by ID")
	public Discipline getById(@PathVariable(value = "id") long id) {
		return disciplineRepository.findById(id);
	}
	
	@PostMapping("/disciplines")
	@ApiOperation(value = "Creates a new Discipline")
	public Discipline create(@RequestBody Discipline discipline) {
		return disciplineRepository.save(discipline);
	}
	
	@PutMapping("/disciplines")
	@ApiOperation(value = "Updates a Discipline")
	public Discipline update(@RequestBody Discipline discipline) {
		return disciplineRepository.save(discipline);
	}
	
	@DeleteMapping("/disciplines")
	@ApiOperation(value = "Deletes a Discipline")
	public void delete(@RequestBody Discipline discipline) {
		disciplineRepository.delete(discipline);
	}
}
