package com.studentmaintainence.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmaintainence.dao.StudentDAO;
import com.studentmaintainence.model.Student;

@Service
public class StudentService {
	@Autowired
	StudentDAO stdDAO;

	public boolean addStudent(String name,int age,int std) {
		int flag=stdDAO.addStudent(name, age, std);
		if(flag>0)
		return true;
		else 
		return false;
		
	}
	
	public boolean updateStudent(int id,String name,int age,int std) {
		
		int flag=stdDAO.updateStudent(id,name, age, std);
		if(flag>0)
		return true;
		else 
		return false;
		
	}
    
	public boolean deleteStudent(int id) {
		
		int flag=stdDAO.deleteStudent(id);
		if(flag>0)
		return true;
		else 
		return false;
		
	}
	

	public Student getStudent(int id) {
		
		Student student=stdDAO.getStudent(id);
		System.out.println(student.getAge());
		if(student.getName()==null && student.getAge()==0 && student.getStd()==0)
		return null;
		
		else 
		return student;
		
	}
	
	public List<Student> getAllStudents() {
		List<Student> list=stdDAO.getAllStudents();
		for(Student s:list) {
			System.out.println(s.getId());
		}
		return list;
	}
	
}
