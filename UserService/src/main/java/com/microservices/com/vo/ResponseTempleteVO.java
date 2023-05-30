package com.microservices.com.vo;

import com.microservices.com.entity.User;

public class ResponseTempleteVO {

	private User user;
	private Department department;

	public ResponseTempleteVO(User user, Department department) {
		super();
		this.user = user;
		this.department = department;
	}

	public ResponseTempleteVO() {
		super();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
