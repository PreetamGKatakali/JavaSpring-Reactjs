package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stdid;
	private String name;
	private String username;
	private String branch;
	private String domain;
	private Double grade;     
	public Student() {
	
	}
	public Student(String name, String username, String branch, String domain, Double grade) {
		this.name = name;
		this.username = username;
		this.branch = branch;
		this.domain = domain;
		this.grade = grade;
	}
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public Double getGrade() {
		return grade;
	}
	public void setGrade(Double grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", name=" + name + ", username=" + username + ", branch=" + branch
				+ ", domain=" + domain + ", grade=" + grade + "]";
	}
	
	
	
	
}
