package com.studentmaintainence.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.studentmaintainence.model.Student;
@Component
public class StudentDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int addStudent(String name,int age,int std) {
		int i=jdbcTemplate.update("insert into student(student_name,student_age,student_std) values(?,?,?)",name,age,std);
		return i;
		
	}

	public int updateStudent(int id,String name,int age,int std) {
		int i=jdbcTemplate.update("update student set student_name=?,student_age=?,student_std=? where student_id=?",name,age,std,id);
		return i;
		
	}
	
	public int deleteStudent(int id) {
		int i=jdbcTemplate.update("delete from student where student_id=?",id);
		return i;
		
	}
	
	public Student getStudent(int id) {
		Student std=new Student();
		try {
		std=jdbcTemplate.query("select * from student where student_id=?", new ResultSetExtractor<Student>() {
			
			@Override
			public Student extractData(ResultSet rs) throws SQLException,DataAccessException{
				rs.next();
				Student st=new Student();
				st.setAge(rs.getInt("student_age"));
				st.setName(rs.getString("student_name"));
				st.setStd(rs.getInt("student_std"));
				st.setId(id);
				return st;
			}
		},id);
	}catch(Exception e) {
		return std;
	}
		return std;
	}
	
	
	public List<Student> getAllStudents() {
		List<Student> std=null;
		try {
		std= jdbcTemplate.query("select * from student", new RowMapper<Student>() {
			
			@Override
			public Student mapRow(ResultSet rs,int rownum) throws SQLException,DataAccessException{
				
				Student st=new Student();
				st.setAge(rs.getInt("student_age"));
				st.setName(rs.getString("student_name"));
				st.setStd(rs.getInt("student_std"));
				st.setId(rs.getInt("student_id"));
				return st;
			}
		});
	}catch(Exception e) {
		return std; 
	}
		return std;
	}
	
}
