package com.microservices.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.com.entity.Teacher;
import com.microservices.com.service.TeacherService;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

	@Autowired
	private TeacherService teacherService;

	@PostMapping("/")
	public Teacher saveTeacher(@RequestBody Teacher teacher) {
		return teacherService.saveTeacher(teacher);
	}

	@GetMapping("/")
	public List<Teacher> getTeachers() {
		return teacherService.getTeachers();
	}
	
	@GetMapping("/getTeachersBySchoolId/{id}")
	public List<Teacher> getTeachersBySchoolId(@PathVariable("id") long id){
		return teacherService.findTeachersBySchoolId(id);
	}
	
	
	@GetMapping("/{id}")
	public Teacher getTeacherById(@PathVariable("id") long id) {
		return teacherService.getTeacherById(id);
	}
}
