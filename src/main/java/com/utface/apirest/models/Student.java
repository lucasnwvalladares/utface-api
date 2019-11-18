package com.utface.apirest.models;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="studens")
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name = "student")
	private User userStudent;
	
	@OneToMany
	private Collection<Picture> pictures;
	
	@OneToMany
	private Collection<StudentClass> studentClasses;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User getUserStudent() {
		return userStudent;
	}

	public void setUserStudent(User userStudent) {
		this.userStudent = userStudent;
	}

	public Collection<Picture> getPictures() {
		return pictures;
	}

	public void setPictures(Collection<Picture> pictures) {
		this.pictures = pictures;
	}

	public Collection<StudentClass> getStudentClasses() {
		return studentClasses;
	}

	public void setStudentClasses(Collection<StudentClass> studentClasses) {
		this.studentClasses = studentClasses;
	}
}
