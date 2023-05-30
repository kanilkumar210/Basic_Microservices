package com.microservices.com.vo;

public class Student {

	private long studentId;
	private String studentName;
	private String studentBranch;
	private String studentAddress;
	private String studentEmail;
	private long schoolId;

	public Student(long studentId, String studentName, String studentBranch, String studentAddress, String studentEmail,
			long schoolId) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentBranch = studentBranch;
		this.studentAddress = studentAddress;
		this.studentEmail = studentEmail;
		this.schoolId = schoolId;
	}

	public long getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(long schoolId) {
		this.schoolId = schoolId;
	}

	public Student(long studentId, String studentName, String studentBranch, String studentAddress,
			String studentEmail) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentBranch = studentBranch;
		this.studentAddress = studentAddress;
		this.studentEmail = studentEmail;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentBranch() {
		return studentBranch;
	}

	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public Student() {
		super();
	}

}
