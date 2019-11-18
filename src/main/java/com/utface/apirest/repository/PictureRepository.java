package com.utface.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utface.apirest.models.Picture;

public interface PictureRepository extends JpaRepository<Picture, String> {
	
	List<Picture> findByStudentCode(String studentCode);

}
