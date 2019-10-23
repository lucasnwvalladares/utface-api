package com.utface.apirest.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class StudentClassId implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "student_id")
    private Long studentId;
 
    @Column(name = "class_id")
    private Long classId;
 
    @SuppressWarnings("unused")
	private StudentClassId() {}
 
    public StudentClassId(Long studentId, Long classId) {
        this.studentId = studentId;
        this.classId = classId;
    }
 
    //Getters omitted for brevity
 
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
 
        if (o == null || getClass() != o.getClass())
            return false;
 
        StudentClassId that = (StudentClassId) o;
        return Objects.equals(studentId, that.studentId) &&
               Objects.equals(classId, that.classId);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(studentId, classId);
    }
}
