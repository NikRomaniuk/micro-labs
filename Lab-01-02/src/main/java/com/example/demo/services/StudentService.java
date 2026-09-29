package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.models.*;
import java.util.*;

@Service
public class StudentService
{
	ArrayList<Student> students = new ArrayList();
	
	public String get()
	{
		return "List";
	}
	
	public ArrayList<Student> post()
	{
		Student s1 = new Student("G001", "John", 21);
		Student s2 = new Student("G011", "Jonn", 23);
		Student s3 = new Student("G111", "Johh", 22);
		
		this.students.add(s1);
		this.students.add(s2);
		this.students.add(s3);
		
		return this.students;
	}
}
