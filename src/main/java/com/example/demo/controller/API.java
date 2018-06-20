package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.vo.Student;

@RestController
@RequestMapping("/API/")
public class API 
{
	@RequestMapping("/janam")
	public String testing() 
	{
        int i=5/0;          // it will throws exception  ArithmeticException: / by zero
		return  "API called....";
		
	}
	

	@RequestMapping("/student")
	public Student Getstud() 
	{
		Student s=new Student(1,"JANAM","Palanpur");
		return  s;
		
	}

}
