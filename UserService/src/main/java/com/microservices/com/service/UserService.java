package com.microservices.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservices.com.entity.User;
import com.microservices.com.external.services.DepartmentService;
import com.microservices.com.repository.UserRepository;
import com.microservices.com.vo.Department;
import com.microservices.com.vo.ResponseTempleteVO;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private DepartmentService departmentService;
	
	

	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	public User findById(long userId) {
		return userRepository.findByUserId(userId);
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	public ResponseTempleteVO getUserWithDepartment(long userId) {
		// TODO Auto-generated method stub
		ResponseTempleteVO vo = new ResponseTempleteVO();
		User user = userRepository.findByUserId(userId);

//		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(),
//				Department.class);

		
		Department department=departmentService.findDepartmentById(user.getDepartmentId());
		vo.setUser(user);
		vo.setDepartment(department);
		return vo;
	}
	

}
