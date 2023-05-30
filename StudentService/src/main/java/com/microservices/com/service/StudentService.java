package com.microservices.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.com.entity.Student;
import com.microservices.com.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepo;

	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	public Student findByStudentId(long id) {
		// TODO Auto-generated method stub
		return studentRepo.findByStudentId(id);
	}

	public List<Student> getStudentsBySchoolId(long id) {
		// TODO Auto-generated method stub
		return studentRepo.findBySchoolId(id);
	}

}
