package com.geekvader.SpringJDBCDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.geekvader.SpringJDBCDemo.model.Student;
import com.geekvader.SpringJDBCDemo.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo repo;
	
	public StudentRepo getRepo() {
		return repo;
	}

	public void setRepo(StudentRepo repo) {
		this.repo = repo;
	}

	public void addStudent(Student s) {
		repo.save(s);
		System.out.println("Service: Added Student");
	}

	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
