package com.example.demo.controllers; 

import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.services.*;

@RestController
public class HelloController
{
	TimeService ts;
	
	public HelloController(TimeService ts)
	{
		super();
		this.ts = ts;
	}

	@GetMapping("/hello")
	public String sayHello()
	{
		return  "Hello, " + this.ts.getGreeting();
	}
}
