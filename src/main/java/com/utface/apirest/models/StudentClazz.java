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
@Table(name="student_clazz")
public class StudentClazz implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private StudentClazzId id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("studentId")
	@JoinColumn(name = "student_id")
    private Student student;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("clazzId")
	@JoinColumn(name = "clazz_id")
	private Clazz clazz;

	public boolean presence;

	public StudentClazzId getId() {
		return id;
	}

	public void setId(StudentClazzId id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Clazz getClazz() {
		return clazz;
	}

	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}

	public boolean isPresence() {
		return presence;
	}

	public void setPresence(boolean presence) {
		this.presence = presence;
	}	
}
