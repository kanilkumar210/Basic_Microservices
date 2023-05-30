package com.microservices.com.external.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservices.com.vo.Teacher;

@FeignClient(name = "TEACHER-SERVICE")
public interface TeacherService {

	@GetMapping("/teachers/getTeachersBySchoolId/{id}")
	public List<Teacher> getTeachersBySchoolId(@PathVariable("id") long id);
}
