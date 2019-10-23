package com.utface.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utface.apirest.models.Picture;

public interface PictureRepository extends JpaRepository<Picture, Long> {
	
	Picture findById(long id);

}
