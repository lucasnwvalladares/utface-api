package com.utface.apirest.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class StudentClazzId implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column(name = "student_id")
    private Long studentId;
 
    @Column(name = "clazz_id")
    private Long clazzId;
 
    //Getters omitted for brevity
 
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
 
        if (o == null || getClass() != o.getClass())
            return false;
 
        StudentClazzId that = (StudentClazzId) o;
        return Objects.equals(studentId, that.studentId) &&
               Objects.equals(clazzId, that.clazzId);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(studentId, clazzId);
    }
}
