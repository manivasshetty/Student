package com.studentmaintainence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.studentmaintainence.model.Student;
import com.studentmaintainence.services.StudentService;
import java.util.List;

@Controller
public class StudentController {
	@Autowired
	StudentService studentService;
  
@RequestMapping(value="addStudent",method=RequestMethod.GET)
public String addStudentForm() {
	return "addStudent";
}
@RequestMapping(value="addStudent",method=RequestMethod.POST)
public String addStudent(@RequestParam String name,@RequestParam int age,@RequestParam int std) {
	if(studentService.addStudent(name, age, std))
		return "redirect:/getAllStudents";
	else 
	return "addStudent";
}

@RequestMapping(value="updateStudent",method=RequestMethod.GET)
public String updateStudentForm() {
	return "updateStudent";
	
}

@RequestMapping(value="updateStudent",method=RequestMethod.POST)
public String updateStudent(@RequestParam int id,@RequestParam String name,@RequestParam int age,@RequestParam int std) {
	if(studentService.updateStudent(id, name, age, std))
		return "redirect:/getAllStudents";
	else
	return "updateStudent";
	
}


@RequestMapping(value="deleteStudent",method=RequestMethod.GET)
public String deleteStudentForm() {
	return "deleteStudent";
	
}

@RequestMapping(value="deleteStudent",method=RequestMethod.POST)
public String deleteStudent(@RequestParam int id) {
	if(studentService.deleteStudent(id))
		return "redirect:/getAllStudents";
	else
	return "deleteStudent";
	
}



@RequestMapping(value="getStudent",method=RequestMethod.GET)
public String getStudentForm() {
	return "getStudent";
	
}

@RequestMapping(value="getStudent",method=RequestMethod.POST)
public String getStudent(@RequestParam int id,Model model) {
	Student student=studentService.getStudent(id);
	if(student!=null) {
	model.addAttribute("student", student);
	return "searchedStudent";
	}
	else
	{
	model.addAttribute("errmsg", "ID does not exists");
	return "getStudent";
	}
}

@RequestMapping(value="getAllStudents",method=RequestMethod.GET)
public String getAllStudents(Model model) {
	List<Student> stdlist=studentService.getAllStudents();
	model.addAttribute("students", stdlist);
	return "Student";
	
}


}
