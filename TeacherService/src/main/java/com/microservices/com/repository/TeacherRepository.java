package com.microservices.com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.com.entity.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

	public List<Teacher> findBySchoolId(long id);

	public Teacher findByTeacherId(long id);

}
