package com.microservices.com.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.microservices.com.vo.Student;
import com.microservices.com.vo.Teacher;

@Entity
public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long schoolId;
	private String schoolName;
	private String schoolAddress;

	@Transient
	private List<Student> students = new ArrayList<>();

	@Transient
	private List<Teacher> teachers = new ArrayList<>();

	public School(long schoolId, String schoolName, String schoolAddress, List<Student> students,
			List<Teacher> teachers) {
		super();
		this.schoolId = schoolId;
		this.schoolName = schoolName;
		this.schoolAddress = schoolAddress;
		this.students = students;
		this.teachers = teachers;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public long getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(long schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public School(long schoolId, String schoolName, String schoolAddress, List<Student> students) {
		super();
		this.schoolId = schoolId;
		this.schoolName = schoolName;
		this.schoolAddress = schoolAddress;
		this.students = students;
	}

	public School() {
		super();
	}

}
