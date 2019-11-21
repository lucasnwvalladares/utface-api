package com.utface.apirest.models;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

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
	
	@OneToMany(mappedBy = "classX", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @Column(nullable = true)
    @JsonManagedReference
    private List<StudentClass> studentClasses;

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

	public List<StudentClass> getStudentClasses() {
		return studentClasses;
	}

	public void setStudentClasses(List<StudentClass> studentClasses) {
		this.studentClasses = studentClasses;
	}
}
