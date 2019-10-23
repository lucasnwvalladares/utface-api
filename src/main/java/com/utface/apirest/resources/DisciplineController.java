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

import com.utface.apirest.models.Discipline;
import com.utface.apirest.repository.DisciplineRepository;

@RestController
@RequestMapping(value = "/api")
public class DisciplineController {
	@Autowired
	DisciplineRepository disciplineRepository;
	
	@GetMapping("/disciplines")
	public List<Discipline> getAll() {
		return disciplineRepository.findAll();
	}
	
	@GetMapping("/disciplines/{id}")
	public Discipline getById(@PathVariable(value = "id") long id) {
		return disciplineRepository.findById(id);
	}
	
	@PostMapping("/disciplines")
	public Discipline create(@RequestBody Discipline discipline) {
		return disciplineRepository.save(discipline);
	}
	
	@PutMapping("/disciplines")
	public Discipline update(@RequestBody Discipline discipline) {
		return disciplineRepository.save(discipline);
	}
	
	@DeleteMapping("/disciplines")
	public void delete(@RequestBody Discipline discipline) {
		disciplineRepository.delete(discipline);
	}
}
