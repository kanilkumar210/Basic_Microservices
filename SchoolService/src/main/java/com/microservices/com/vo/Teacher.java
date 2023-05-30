package com.microservices.com.vo;

public class Teacher {
	private long teacherId;
	private String teacherName;
	private long schoolId;

	public Teacher(long teacherId, String teacherName, long schoolId) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.schoolId = schoolId;
	}

	public long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(long teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public long getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(long schoolId) {
		this.schoolId = schoolId;
	}

	public Teacher() {
		super();
	}

}
