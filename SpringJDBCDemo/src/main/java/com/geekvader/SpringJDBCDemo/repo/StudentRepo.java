package com.geekvader.SpringJDBCDemo.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.geekvader.SpringJDBCDemo.model.Student;


@Repository
public class StudentRepo {
	
	private JdbcTemplate jdbc;

	public JdbcTemplate getJdbc() {
		return jdbc;
	}
	
	@Autowired
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	
	public void save(Student s) {
		String sql = "INSERT INTO student (rollno, name, marks) values (?, ?, ?)";
		int rows = jdbc.update(sql, s.getRollNo(), s.getName(), s.getMarks());
		System.out.println(rows + " affected");
		
		System.out.println("Repo: Student saved");
	}


	public List<Student> findAll() {
		String sql="select * from student"; 
		RowMapper<Student> mapper = new RowMapper<Student>() 
				{
					@Override public Student mapRow(ResultSet rs, int rowNum) throws SQLException
						{ 
							Student s=new Student(); 
							s.setRollNo(rs.getInt("rollno"));
							s.setName(rs.getString("name")); 
							s.setMarks(rs.getInt("marks")); 
							return s; 
						}
				}; 
		return jdbc.query(sql, mapper); 
	}


	
	
	

}
