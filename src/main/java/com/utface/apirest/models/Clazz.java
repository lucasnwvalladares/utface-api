package com.utface.apirest.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="clazzes")
public class Clazz implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "clazz_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@OneToMany(mappedBy = "clazz")
	private List<StudentClazz> studentClazz;
	
	private int quantity;
	
	private String date;
	
	private String time;
	
	private String content;
	
	private String disciplineCode;
	
	private Picture picture;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDisciplineCode() {
		return disciplineCode;
	}

	public void setDisciplineCode(String disciplineCode) {
		this.disciplineCode = disciplineCode;
	}

	public Picture getPicture() {
		return picture;
	}

	public void setPicture(Picture picture) {
		this.picture = picture;
	}

	public List<StudentClazz> getStudentClazz() {
		return studentClazz;
	}

	public void setStudentClazz(List<StudentClazz> studentClazz) {
		this.studentClazz = studentClazz;
	}

	
}
