package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Lab0202Application
{
	public static void main(String[] args)
	{
		ApplicationContext ctx = SpringApplication.run(Lab0202Application.class, args);
		String[] beans = ctx.getBeanDefinitionNames();
		
		for (int i=0; i<beans.length; i++)
		{ 
			System.out.println(i + ": " + beans[i]);
		} 
	}
}
