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

import com.utface.apirest.models.Professor;
import com.utface.apirest.repository.ProfessorRepository;

@RestController
@RequestMapping(value = "/api")
public class ProfessorController {
	@Autowired
	ProfessorRepository professorRepository;
	
	@GetMapping("/professors")
	public List<Professor> getAll() {
		return professorRepository.findAll();
	}
	
	@GetMapping("/professors/{id}")
	public Professor getById(@PathVariable(value = "id") long id) {
		return professorRepository.findById(id);
	}
	
	@PostMapping("/professors")
	public Professor create(@RequestBody Professor professor) {
		return professorRepository.save(professor);
	}
	
	@PutMapping("/professors")
	public Professor update(@RequestBody Professor professor) {
		return professorRepository.save(professor);
	}
	
	@DeleteMapping("/professors")
	public void delete(@RequestBody Professor professor) {
		professorRepository.delete(professor);
	}
}
