package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepo;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepo stuRepo;
	
	@PostMapping("/peters/stu/add")
	public Student addNewStudent(@RequestBody Student stu){
		
		System.out.println("from browser student---->"+stu);
		
		Student dbStu = stuRepo.save(stu);
		
		return dbStu;
	}

}
