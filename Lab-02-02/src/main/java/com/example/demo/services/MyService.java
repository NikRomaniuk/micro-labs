package com.example.demo.services;

import org.springframework.stereotype.Service;

public class MyService
{
	private String message;

	public MyService(String message)
	{
		super();
		this.message = message;
	}

	public String getMessage()
	{
		return message;
	}

}
