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

import com.utface.apirest.models.Professor;
import com.utface.apirest.repository.ProfessorRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "UTFace - REST API")
@CrossOrigin(origins = "*")
public class ProfessorController {
	@Autowired
	ProfessorRepository professorRepository;
	
	@GetMapping("/professors")
	@ApiOperation(value = "Returns a list of Professors")
	public List<Professor> getAll() {
		return professorRepository.findAll();
	}
	
	@GetMapping("/professors/{id}")
	@ApiOperation(value = "Returns a Professor by ID")
	public Professor getById(@PathVariable(value = "id") long id) {
		return professorRepository.findById(id);
	}
	
	@PostMapping("/professors")
	@ApiOperation(value = "Creates a new Professor")
	public Professor create(@RequestBody Professor professor) {
		return professorRepository.save(professor);
	}
	
	@PutMapping("/professors")
	@ApiOperation(value = "Updates a Professor")
	public Professor update(@RequestBody Professor professor) {
		return professorRepository.save(professor);
	}
	
	@DeleteMapping("/professors")
	@ApiOperation(value = "Deletes a Professor")
	public void delete(@RequestBody Professor professor) {
		professorRepository.delete(professor);
	}
}
