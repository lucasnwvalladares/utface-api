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

import com.utface.apirest.models.Picture;
import com.utface.apirest.repository.PictureRepository;

@RestController
@RequestMapping(value = "/api")
public class PictureController {
	@Autowired
	PictureRepository pictureRepository;
	
	@GetMapping("/pictures")
	public List<Picture> getAll() {
		return pictureRepository.findAll();
	}
	
	@GetMapping("/pictures/{id}")
	public Picture getById(@PathVariable(value = "id") long id) {
		return pictureRepository.findById(id);
	}
	
	@PostMapping("/pictures")
	public Picture create(@RequestBody Picture picture) {
		return pictureRepository.save(picture);
	}
	
	@PutMapping("/pictures")
	public Picture update(@RequestBody Picture picture) {
		return pictureRepository.save(picture);
	}
	
	@DeleteMapping("/pictures")
	public void delete(@RequestBody Picture picture) {
		pictureRepository.delete(picture);
	}
}
