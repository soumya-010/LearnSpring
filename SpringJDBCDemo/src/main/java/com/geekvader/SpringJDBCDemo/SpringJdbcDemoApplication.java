package com.geekvader.SpringJDBCDemo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.geekvader.SpringJDBCDemo.model.Student;
import com.geekvader.SpringJDBCDemo.service.StudentService;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringJdbcDemoApplication.class, args);
		Student s = context.getBean(Student.class);
		
		s.setRollNo(19);
		s.setName("Soumya");
		s.setMarks(1);
		
		System.out.println(s.toString());
		
		StudentService service = context.getBean(StudentService.class);
		
		service.addStudent(s);
		
		List<Student> students = service.getStudents();
		System.out.println(students);
	}

}
