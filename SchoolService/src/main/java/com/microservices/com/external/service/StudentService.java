package com.microservices.com.external.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservices.com.vo.Student;

@FeignClient(name = "STUDENT-SERVICE")
public interface StudentService {

	@GetMapping("/students/getStudentsBySchoolId/{id}")
	public List<Student> getStudentsBySchoolId(@PathVariable("id") long id);
}
