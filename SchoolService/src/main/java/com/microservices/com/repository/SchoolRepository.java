package com.microservices.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.com.entity.School;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {

	public School findBySchoolId(long id);

}
