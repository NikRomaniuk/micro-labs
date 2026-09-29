package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Student;
import com.example.demo.services.*;

@RestController
public class MainController
{
	StudentService ss;
	
	public MainController(StudentService ss)
	{
		super();
		this.ss = ss;
	}

	@PostMapping("/")
	public ArrayList<Student> post()
	{
		return this.ss.post();
	}
	
	@GetMapping("/students")
	public ArrayList<Student> get()
	{
		return this.ss.get();
	}
	
	@DeleteMapping("/students/{id}")
	public String delete() { return "Student DELETED"; }
}
