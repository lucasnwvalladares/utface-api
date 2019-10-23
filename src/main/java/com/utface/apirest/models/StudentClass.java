package com.utface.apirest.models;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="student_class")
public class StudentClass implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private StudentClassId id;
	
	@ManyToOne
	@JoinColumn(name = "student_id", insertable = false, updatable = false)
	public Student student;
	
	@ManyToOne
	@JoinColumn(name = "class_id", insertable = false, updatable = false)
	public ClassX classX;

	public boolean presence;

	public StudentClassId getId() {
		return id;
	}

	public void setId(StudentClassId id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public ClassX getStudentClass() {
		return classX;
	}

	public void setStudentClass(ClassX studentClass) {
		this.classX = studentClass;
	}

	public boolean isPresence() {
		return presence;
	}

	public void setPresence(boolean presence) {
		this.presence = presence;
	}
}
