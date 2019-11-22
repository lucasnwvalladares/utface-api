package com.utface.apirest.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student_class")
public class StudentClass implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private StudentClassId id;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "studentClass")
    private List<Student> students;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "studentClass")
    private List<Clazz> classes;

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

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Clazz> getClazz() {
		return classes;
	}

	public void setClazz(List<Clazz> clazz) {
		this.classes = clazz;
	}
}
