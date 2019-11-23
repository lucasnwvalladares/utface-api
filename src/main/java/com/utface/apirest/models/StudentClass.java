package com.utface.apirest.models;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import javax.persistence.Table;

@Entity
@Table(name="student_class")
public class StudentClass implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private StudentClassId id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("student_id")
	@JoinColumn(name = "student_id")
    private Student students;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("clazz_id")
	@JoinColumn(name = "clazz_id")
	private Clazz classes;

	public boolean presence;

	public StudentClassId getId() {
		return id;
	}

	public void setId(StudentClassId id) {
		this.id = id;
	}
	
	public boolean isPresence() {
		return presence;
	}

	public void setPresence(boolean presence) {
		this.presence = presence;
	}	

	public Student getStudents() {
		return students;
	}

	public void setStudents(Student students) {
		this.students = students;
	}

	public Clazz getClasses() {
		return classes;
	}

	public void setClasses(Clazz classes) {
		this.classes = classes;
	}
	
}
