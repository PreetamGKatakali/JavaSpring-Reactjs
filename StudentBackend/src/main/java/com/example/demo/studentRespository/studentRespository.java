package com.example.demo.studentRespository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Student;

public interface studentRespository extends JpaRepository<Student,Integer>{

}
