package com.microservices.com.external.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservices.com.vo.Department;

@FeignClient(name = "DEPARTMENT-SERVICE")
public interface DepartmentService {

	@GetMapping("/departments/{departmentId}")
	public Department findDepartmentById(@PathVariable("departmentId") long departmentId);

}
