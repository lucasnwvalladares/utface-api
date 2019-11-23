package com.utface.apirest.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_clazz")
public class StudentClazz implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private boolean presence;
	
	@Column(name = "student_code")
	private String studentCode;
	
	@Column(name = "clazz_id")
	private String clazzId;
	
	/**@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("studentId")
	@JoinColumn(name = "student_id")
    private Student student;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("clazzId")
	@JoinColumn(name = "clazz_id")
	private Clazz clazz;*/

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public boolean isPresence() {
		return presence;
	}

	public void setPresence(boolean presence) {
		this.presence = presence;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public String getClazzId() {
		return clazzId;
	}

	public void setClazzId(String clazzId) {
		this.clazzId = clazzId;
	}

	/**public Student getStudent() {
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
	}*/
}
