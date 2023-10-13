package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.studentService.StudentService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class MyController {
	
	@Autowired
	StudentService std;
	
	@RequestMapping(value = "/",method =RequestMethod.GET)
	public List<Student> getstudentList() {
		return std.getAllStudent();
	}
	
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public List<Student> addstudent(@RequestBody Student s){
		return std.addStudent(s);
	}
	
	@RequestMapping(value = "/getstudent/{stdid}",method = RequestMethod.GET)
	public Optional<Student> getstudent(@PathVariable int stdid) {
		return std.getStudent(stdid);
	}
	
	@RequestMapping(value = "/delete/{stdid}",method = RequestMethod.DELETE)
	public List<Student> deleteStudentbyid(@PathVariable int stdid) {
		return std.deleteStudentById(stdid);
	}
	
	@RequestMapping(value = "/update/{stdid}",method = RequestMethod.PUT)
	public Student updatestudentbyid(@PathVariable int stdid,@RequestBody Student s) {
		return std.updateStudentById(stdid, s);
	}
	
}
