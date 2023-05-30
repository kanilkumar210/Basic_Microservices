package com.microservices.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservices.com.entity.School;
import com.microservices.com.external.service.StudentService;
import com.microservices.com.external.service.TeacherService;
import com.microservices.com.repository.SchoolRepository;

@Service
public class SchoolService {

	@Autowired
	private SchoolRepository schoolRepo;

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private StudentService studentService;

	@Autowired
	private TeacherService teacherService;

	public School saveUser(School school) {
		// TODO Auto-generated method stub
		return schoolRepo.save(school);
	}

	public List<School> getSchools() {
		// TODO Auto-generated method stub
		return schoolRepo.findAll();
	}

	public School getStudentsBySchoolId(long id) {
		// TODO Auto-generated method stub
		School school = schoolRepo.findBySchoolId(id);

//		ArrayList students = restTemplate.getForObject("http://localhost:8001/students/getStudentsBySchoolId/" + school.getSchoolId(),
//				ArrayList.class);

		school.setStudents(studentService.getStudentsBySchoolId(school.getSchoolId()));
		return school;
	}

	public School getTeachersBySchoolId(long id) {
		// TODO Auto-generated method stub

		School school = schoolRepo.findBySchoolId(id);

		school.setTeachers(teacherService.getTeachersBySchoolId(school.getSchoolId()));

		return school;
	}

	public School getTeacherAndStudentsBySchoolId(long id) {
		School school = schoolRepo.findBySchoolId(id);
		school.setStudents(studentService.getStudentsBySchoolId(school.getSchoolId()));
		school.setTeachers(teacherService.getTeachersBySchoolId(school.getSchoolId()));
		return school;
	}

}
