package com.example.demo.services;

import org.springframework.stereotype.Service;
import java.time.LocalTime;

@Service
public class TimeService
{
	public String getGreeting()
	{
		LocalTime currentTime = LocalTime.now();
		int currentHour = currentTime.getHour();
		
		String greetingMessage = "None";
		
		if(currentHour < 12)
		{
			greetingMessage = "Morning";
		}
		else if (currentHour < 17)
		{
			greetingMessage = "Afternoon";
		}
		else if (currentHour < 21)
		{
			greetingMessage = "Evening";
		}
		else
		{
			greetingMessage = "Night";
		}
		
		return greetingMessage;
	}
}
