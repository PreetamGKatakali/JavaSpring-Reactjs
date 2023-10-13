package com.example.demo.studentService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.studentRespository.studentRespository;

@Service
public class StudentService {
	
	@Autowired
	studentRespository std;
	
	public List<Student> getAllStudent(){
		return std.findAll();
	}
	
	public List<Student> addStudent(Student s){
		 std.save(s);
		 return std.findAll();
	}
	
	public Optional<Student> getStudent(int stdid) {
		return std.findById(stdid);
	}
	
	public List<Student> deleteStudentById(int stdid){
		std.deleteById(stdid);
		return std.findAll();
	}
	
	public Student updateStudentById(int stdid,Student s) {
		Student oldstd=std.findById(stdid).orElse(null);
		System.out.println(s);
		oldstd.setStdid(stdid);
		oldstd.setName(s.getName());
		oldstd.setUsername(s.getUsername());
		oldstd.setBranch(s.getBranch());
		oldstd.setDomain(s.getDomain());
		oldstd.setGrade(s.getGrade());
		std.save(oldstd);
		return oldstd;
	}
}
