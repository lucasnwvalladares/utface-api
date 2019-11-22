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

import com.utface.apirest.models.Picture;
import com.utface.apirest.repository.PictureRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "UTFace - REST API")
@CrossOrigin(origins = "*")
public class PictureController {
	@Autowired
	PictureRepository pictureRepository;
	
	@GetMapping("/pictures")
	@ApiOperation(value = "Returns a list of Pictures")
	public List<Picture> getAll() {
		return pictureRepository.findAll();
	}
	
	@GetMapping("/pictures/{id}")
	@ApiOperation(value = "Returns a Picture by ID")
	public Picture getByStudentCode(@PathVariable(value = "id") long id) {
		return pictureRepository.findById(id);
	}
	
	@PostMapping("/pictures")
	@ApiOperation(value = "Creates a new Picture")
	public Picture create(@RequestBody Picture picture) {
		return pictureRepository.save(picture);
	}
	
	@PutMapping("/pictures")
	@ApiOperation(value = "Updates a Picture")
	public Picture update(@RequestBody Picture picture) {
		return pictureRepository.save(picture);
	}
	
	@DeleteMapping("/pictures")
	@ApiOperation(value = "Deletes a Picture")
	public void delete(@RequestBody Picture picture) {
		pictureRepository.delete(picture);
	}
}
