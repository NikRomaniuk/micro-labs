package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.MyService;

@RestController
public class MyController
{
	MyService myService;
	
	public MyController(MyService myService)
	{
		super();
		this.myService = myService;
	}
	
	@GetMapping("/")
	public String get()
	{
		return this.myService.getMessage();
	}
}
