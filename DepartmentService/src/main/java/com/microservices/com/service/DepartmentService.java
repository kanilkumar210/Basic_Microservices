package com.microservices.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.com.entity.Department;
import com.microservices.com.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository deparmentRepository;

	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return deparmentRepository.save(department);
	}

	public Department findDepartmentById(long departmentId) {
		return deparmentRepository.findByDepartmentId(departmentId);
	}

	public List<Department> getAllDepartments() {
		return deparmentRepository.findAll();
	}

}
