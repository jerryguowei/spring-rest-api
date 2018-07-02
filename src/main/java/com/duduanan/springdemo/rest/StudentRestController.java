package com.duduanan.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duduanan.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	private List<Student> students;
	
	@PostConstruct
	public void loadData(){
		students=new ArrayList<>();
		students.add(new Student("john","Guo"));
		students.add(new Student("Brant","Kobe"));
		students.add(new Student("Mary","KiKi"));
		students.add(new Student("John","Onealf"));
	}
	
	
	@GetMapping("/students")
	public List<Student> getStudent(){
		return students;
	}
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId){
		if(studentId>=students.size()||studentId<0){
			throw new StudentNotFoundException("student id is not found - " + studentId);
		}
		return students.get(studentId);
	}

	
}
