package com.microservices.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.com.entity.Teacher;
import com.microservices.com.repository.TeacherRepository;

@Service
public class TeacherService {

	@Autowired
	private TeacherRepository teacherRepo;

	public Teacher saveTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherRepo.save(teacher);
	}

	public List<Teacher> getTeachers() {
		// TODO Auto-generated method stub
		return teacherRepo.findAll();
	}

	public List<Teacher> findTeachersBySchoolId(long id) {
		// TODO Auto-generated method stub
		return teacherRepo.findBySchoolId(id);
	}

	public Teacher getTeacherById(long id) {
		// TODO Auto-generated method stub
		return teacherRepo.findByTeacherId(id);
	}
}
