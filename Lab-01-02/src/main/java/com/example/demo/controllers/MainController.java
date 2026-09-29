package com.example.demo.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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
	public String post()
	{
		return this.ss.ssPost();
	}
	
	@GetMapping("/students")
	public String get() { return "GET"; }
	
	@DeleteMapping("/students/{id}")
	public String delete() { return "Student DELETED"; }
}
