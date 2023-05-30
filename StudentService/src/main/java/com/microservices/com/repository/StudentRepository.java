package com.microservices.com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.com.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	public Student findByStudentId(long studentId);

	public List<Student>  findBySchoolId(long id);

}
