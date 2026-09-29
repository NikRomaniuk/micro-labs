package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.models.*;
import java.util.*;

@Service
public class StudentService
{
	private ArrayList<Student> students = new ArrayList();
	
	public ArrayList<Student> get()
	{
		return this.students;
	}
	
	public void add(Student s)
	{
		students.add(s);
	}
	
	public void removeById(String id)
	{
		ArrayList<Student> removeList = new ArrayList();
		
		for (int i = 0; i < students.size(); i++)
		{
			if(students.get(i).getId().equals(id))
			{
				removeList.add(students.get(i));
			}
		}
		
		students.removeAll(removeList);
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
