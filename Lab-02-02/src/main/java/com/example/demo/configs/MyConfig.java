package com.example.demo.configs;

import org.springframework.context.annotation.*;

import com.example.demo.services.MyService;

@Configuration
public class MyConfig
{
	@Bean
	public MyService myServiceEN()
	{
		return new MyService("Hello");
	}
	
	@Bean
	public MyService myServiceFR()
	{
		return new MyService("Bonjour");
	}
}
