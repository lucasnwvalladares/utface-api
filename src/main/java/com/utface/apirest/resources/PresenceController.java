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

import com.utface.apirest.models.Presence;
import com.utface.apirest.repository.PresenceRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "UTFace - REST API")
@CrossOrigin(origins = "*")
public class PresenceController {
	@Autowired
	PresenceRepository presenceRepository;
	
	@GetMapping("/presence")
	@ApiOperation(value = "Returns a list of Presence")
	public List<Presence> getAll() {
		return presenceRepository.findAll();
	}
	
	@GetMapping("/presence/{student_code}")
	@ApiOperation(value = "Returns a Presence by Student Code")
	public List<Presence> getById(@PathVariable(value = "student_code") String student_code) {
		return presenceRepository.findByStudentCode(student_code);
	}
	
	@PostMapping("/presence")
	@ApiOperation(value = "Creates a new Presence")
	public Presence create(@RequestBody Presence presence) {
		return presenceRepository.save(presence);
	}
	
	@PutMapping("/presence")
	@ApiOperation(value = "Updates a Presence")
	public Presence update(@RequestBody Presence presence) {
		return presenceRepository.save(presence);
	}
	
	@DeleteMapping("/presence")
	@ApiOperation(value = "Deletes a Presence")
	public void delete(@RequestBody Presence presence) {
		presenceRepository.delete(presence);
	}
}
