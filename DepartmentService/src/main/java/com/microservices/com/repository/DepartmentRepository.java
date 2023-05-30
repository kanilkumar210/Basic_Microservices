package com.microservices.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.com.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

	public Department findByDepartmentId(long departmentId);

}
